(function() {

	// Chart design based on the recommendations of Stephen Few. Implementation
	// based on the work of Clint Ivy, Jamie Love, and Jason Davies.
	// http://projects.instantcognition.com/protovis/bulletchart/
	d3.test = function() {
		var orient = "left", // TODO top & bottomtepa
			reverse = false,
			duration = 0,
			threshold = testThreshold,
			coverage = testCoverage,
			results = testResults,
			width = 380,
			height = 30,
			tickFormat = null;

		// For each small multiple…
		function test(g) {
			g.each(function(d, i) {
				var //coverag = coverage.call(this, d, i),
				resultz = results.call(this, d, i).slice().sort(d3.descending),
				thresh = threshold.call(this, d, i),
				g = d3.select(this);

				// Compute the new x-scale.
				var x1 = d3.scale.linear()
					.domain([0, 100])
					.range(reverse ? [width, 0] : [0, width]);

				// Retrieve the old x-scale, if this is an update.
				var x0 = this.__chart__ || d3.scale.linear()
					.domain([0, Infinity])
					.range(x1.range());

				// Stash the new scale.
				this.__chart__ = x1;

				// Derive width-scales from the x-scales.
				var w0 = testWidth(x0),
					w1 = testWidth(x1);

				// Update the results rects.
				var result = g.selectAll("rect.result")
					.data(resultz);

				result.enter().append("rect")
					.attr("class", function(d, i) { return "result s" + i; })
					.attr("width", w0)
					.attr("height", height / 3)
					.attr("x", reverse ? x0 : 0)
					.attr("y", height / 3)
					.transition()
						.duration(duration)
						.attr("width", w1)
						.attr("x", reverse ? x1 : 0);

				result.transition()
					.duration(duration)
					.attr("width", w1)
					.attr("height", height / 3)
					.attr("x", reverse ? x1 : 0)
					.attr("y", height / 3);

				// Update the marker lines.
				var marker = g.selectAll("line.marker")
					.data(thresh);

				marker.enter().append("line")
					.attr("class", "marker")
					.attr("x1", x0)
					.attr("x2", x0)
					.attr("y1", height / 6)
					.attr("y2", height * 5 / 6)
					.transition()
						.duration(duration)
						.attr("x1", x1)
						.attr("x2", x1);

				marker.transition()
					.duration(duration)
					.attr("x1", x1)
					.attr("x2", x1)
					.attr("y1", height / 6)
					.attr("y2", height * 5 / 6);
				 
				// Update the current indicator
				var current = g.selectAll("circle.marker")
					.data(coverage);
					
				current.enter().append("circle")
					.attr("class", "cover")
					.attr("cx", x0)
					.attr("cy", height / 2)
					.attr("r", height  / 6)
					.attr("stroke", "black")
					.attr("stroke-width", 2)
					.transition()
						.duration(duration)
						.attr("cx", x1)
						.attr("cy", height / 2)

		// Compute the tick format.
		  var format = tickFormat || x1.tickFormat(8);

		  // Update the tick groups.
		  var tick = g.selectAll("g.tick")
			  .data(x1.ticks(8), function(d) {
				return this.textContent || format(d);
			  });

		  // Initialize the ticks with the old scale, x0.
		  var tickEnter = tick.enter().append("g")
			  .attr("class", "tick")
			  .attr("transform", testTranslate(x0))
			  .style("opacity", 1e-6);

		  tickEnter.append("line")
			  .attr("y1", height)
			  .attr("y2", height * 7 / 6);

		  tickEnter.append("text")
			  .attr("text-anchor", "middle")
			  .attr("dy", "1em")
			  .attr("y", height * 7 / 6)
			  .text(format);

		  // Transition the entering ticks to the new scale, x1.
		  tickEnter.transition()
			  .duration(duration)
			  .attr("transform", testTranslate(x1))
			  .style("opacity", 1);

		  // Transition the updating ticks to the new scale, x1.
		  var tickUpdate = tick.transition()
			  .duration(duration)
			  .attr("transform", testTranslate(x1))
			  .style("opacity", 1);

		  tickUpdate.select("line")
			  .attr("y1", height)
			  .attr("y2", height * 7 / 6);

		  tickUpdate.select("text")
			  .attr("y", height * 7 / 6);

		  // Transition the exiting ticks to the new scale, x1.
		  tick.exit().transition()
			  .duration(duration)
			  .attr("transform", testTranslate(x1))
			  .style("opacity", 1e-6)
			  .remove();
		});
		d3.timer.flush();
	  }

	  // left, right, top, bottom
	  test.orient = function(x) {
		if (!arguments.length) return orient;
		orient = x;
		reverse = orient == "right" || orient == "bottom";
		return test;
	  };

	  // ranges (bad, satisfactory, good)
	  test.results = function(x) {
		if (!arguments.length) return results;
		results = x;
		return test;
	  };

	  // markers (previous, goal)
	  test.threshold = function(x) {
		if (!arguments.length) return threshold;
		threshold = x;
		return test;
	  };

	  test.width = function(x) {
		if (!arguments.length) return width;
		width = x;
		return test;
	  };

	  test.height = function(x) {
		if (!arguments.length) return height;
		height = x;
		return test;
	  };

	  test.tickFormat = function(x) {
		if (!arguments.length) return tickFormat;
		tickFormat = x;
		return test;
	  };

	  test.duration = function(x) {
		if (!arguments.length) return duration;
		duration = x;
		return test;
	  };

	  return test;
	};

	function testResults(d) {
	  return d.results;
	}

	function testThreshold(d) {
	  var x = new Array(1);
	  x[0] = d.threshold;
	  return x;
	}

	function testTranslate(x) {
	  return function(d) {
		return "translate(" + x(d) + ",0)";
	  };
	}

	function testWidth(x) {
	  var x0 = x(0);
	  return function(d) {
		return Math.abs(x(d) - x0);
	  };
	}

	function testCoverage(d) {
		var x = new Array(1);
		x[0] = d.value[0];
		return x;
	}
})();