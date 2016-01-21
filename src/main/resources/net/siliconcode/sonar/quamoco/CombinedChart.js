(function() {

	d3.CombinedChart = function() {
		var insets = {top: 5, bottom: 20, maxSpark: 0, marginWidth: 5, space: 6, sbarWidth: 5, sbarGap: 2, sparkLeft: 0, sparkWidth: 0, barLeft: 0, sparkMid: 0, maxWidth: 0, valueWidth: 0, valueLeft: 0, barRight: 0, barMid: 0, gradeLeft: 0, gradeMid: 0, gradeWidth: 20, valueMid: 0},
			height = 45 - insets.top - insets.bottom,
			valueFixed = 2,
			containerWidth = 615,
			data = null,
			grade = true,
			containerID = null,
			cssclass = "quamoco";
	
		function CombinedChart() {}
		CombinedChart.createChart = function() {
			if (data) {
				this.updateInsets();

				var chart = d3.bullet()
					.width(insets.barRight - insets.barLeft)
					.height(height);

				var svg = d3.select(containerID)
					.selectAll("svg")
					.data(data)
					.enter()
					.append("svg")
					  .attr("class", cssclass)
					  .attr("width", insets.maxWidth)
					  .attr("height", 45)
					  .append("g")
					  .attr("transform", "translate(" + insets.barLeft + "," + insets.top + ")")
					  .call(chart);

				this.createTitle(svg);

				var value = svg.append("g")
					.style("text-anchor", "end")
					.attr("transform", "translate(" + (insets.valueMid - insets.barLeft) + "," + height / 2 + ")");

				valueWithChange(value, 0, height / 2, insets.space, false, "value", null, "", valueFixed, valueFixed);
				this.createSpark(svg);
				
				if (grade)
					this.createGrade(svg);
				
				this.constructHeader();
			}
		}
		
		CombinedChart.height = function(x) {
			if (!arguments.length) return height;
			height = x;
			return CombinedChart;
		}
		
		CombinedChart.valueFixed = function(x) {
			if (!arguments.length) return valueFixed;
			valueFixed = x;
			return CombinedChart;
		}
		
		CombinedChart.containerWidth = function(x) {
			if (!arguments.length) return containerWidth;
			containerWidth = x;
			return CombinedChart;
		}
		
		CombinedChart.data = function(x) {
			if (!arguments.length) return data;
			data = x;
			return CombinedChart;
		}
		
		CombinedChart.insets = function(x) {
			if (!arguments.length) return insets;
			insets = x;
			return CombinedChart;
		}
		
		CombinedChart.grade = function(x) {
			if (!arguments.length) return grade;
			grade = x;
			return CombinedChart;
		}
		
		CombinedChart.containerID = function(x) {
			if (!arguments.length) return containerID;
			containerID = x;
			return CombinedChart;
		}
		
		CombinedChart.cssclass = function(x) {
			if (!arguments.length) return cssclass;
			cssclass = x;
			return CombinedChart;
		}
		
		CombinedChart.createTitle = function(svg) {
			var title = svg.append("g")
				.style("text-anchor", "end")
				.attr("transform", "translate(" + (insets.sparkLeft - insets.barLeft) + "," + height / 2 + ")");

			title.append("text")
				.attr("class", "label")
				.text(function(d) { return d.title; });

			title.append("text")
				.attr("class", "sublabel")
				.attr("dy", "1.4em")
				.text(function(d) { return d.subtitle; });
		}
		
		CombinedChart.createGrade = function(svg) {
			var grade_g = svg.append("g")
				.attr("transform", "translate(" + (insets.gradeLeft - insets.barLeft) + "," + height / 2 + ")");
			
			grade_g.append("rect")
				.attr({
					x: 0,
					y: -10,
					width: 20,
					height: 20,
				})
				.attr("class", function(d) { return "graderect " + d.grade; });

			grade_g.append("text")
				.style("text-anchor", "middle")
				.attr("class", "smallgrade")
				.attr("x", insets.gradeMid - insets.gradeLeft)
				.attr("y", 8)
				.text(function(d) { return d.grade; });
		}
		
		CombinedChart.createSpark = function(svg) {
			var spark = svg.append("g"),
					w = insets.sparkWidth,
					h = height,
					barPadding = 2;
			spark = spark.attr("transform", "translate(" + (insets.sparkLeft - insets.barLeft + insets.space) + "," + height / 2 + ")");
			
			spark.selectAll("rect")
				.data(function(d) { insets.maxSpark = d.last10max; return d.last10; })
				.enter()
				.append("rect")
				.attr({
					x: function(d, i) { return i * (w / 10);},
					y: function(d) { return (height / 2 - 20) + (20 - (d / insets.maxSpark * 20)); }, //function(d) { var scale = d3.scale.linear().domain([0,1]).range([insets.bottom, insets.top]); return scale.linear(d)},
					width: function(d) { return w / 10 - barPadding; },
					height: function(d) { return ((d / insets.maxSpark * 20)); },
					fill: "black"
				});
		}
		
		CombinedChart.constructHeader = function() {
			var svg2 = d3.select(containerID)
				.insert("svg","svg")
					.attr("class", "quamoco")
					.attr("width", insets.maxWidth)
					.attr("height", 20)
					.append("g")
					.style("text-anchor", "start")

			svg2.append("text")
				.style("text-anchor", "middle")
				.attr("class", "header")
				.attr("x", insets.sparkMid)
				.attr("y", 15)
				.text("Last 10 Builds");
				
			svg2.append("text")
				.style("text-anchor", "middle")
				.attr("class", "header")
				.attr("x", insets.barMid)
				.attr("y", 15)
				.text("Current Build");
				
			svg2.append("text")
				.style("text-anchor", "middle")
				.attr("class", "header")
				.attr("x", insets.valueMid)
				.attr("y", 15)
				.text("Current");
			
			if (grade) {
				svg2.append("text")
					.style("text-anchor", "middle")
					.attr("class", "header")
					.attr("x", insets.gradeMid)
					.attr("y", 15)
					.text("Grade");
			}
		}
		
		CombinedChart.updateInsets = function() {
			var titlelen = [];
			var subtitlelen = [];
			var valuelen = [];
			var d = this.data();
			var insets = this.insets();
			for (var i = 0; i < d.length; i++) {
				titlelen.push(d[i].title.length);
				subtitlelen.push(d[i].subtitle.length);
				valuelen.push(d[i].value[0].toFixed(valueFixed).toString().length);
			}
			var x = Math.max.apply(Math, titlelen) * 8;
			var y = Math.max.apply(Math, subtitlelen) * 5;
			var z = Math.max.apply(Math, valuelen) * 12;
			insets["sparkLeft"] = Math.max(x, y);
			insets["sparkWidth"] = (insets.sbarWidth * 10) + (insets.sbarGap * 0);
			insets["barLeft"] = insets.sparkLeft + (2 * insets.space) + insets.sparkWidth;
			insets["sparkMid"] = insets.barLeft - ((insets.barLeft - insets.sparkLeft) / 2);
			insets["maxWidth"] = containerWidth - (2 * insets.marginWidth);
			insets["valueWidth"] = 2 * z;
			insets["valueLeft"] = insets.maxWidth - (((grade ? 2 : 1) * insets.space) + (grade ? insets.gradeWidth : 0) + insets.valueWidth);
			insets["barRight"] = insets.valueLeft;
			insets["barMid"] = insets.barRight - ((insets.barRight - insets.barLeft) / 2);
			insets["gradeLeft"] = insets.maxWidth - (insets.gradeWidth + insets.space);
			insets["gradeMid"] = grade ? (insets.maxWidth - ((insets.gradeWidth / 2) + insets.space)) : 0;
			insets["valueMid"] = insets.gradeLeft - ((insets.gradeLeft - insets.valueLeft) / 2);
		}
		
		return CombinedChart;
	};
})();