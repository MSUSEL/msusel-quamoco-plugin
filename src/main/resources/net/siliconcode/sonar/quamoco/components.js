function gradebox(container, header, category) {
	container.append("text")
		.attr("class", "title")
		.attr("fill", "#999")
		.attr("x", 0)
		.attr("y", 20)
		.text(header);
	
	var grade_g = container.append("g")
		.style("text-anchor", "start")
		.attr("transform", "translate(0, 40)");
	
	grade_g.append("text")
		.attr("class", "subtitle")
		.attr({
			x: 0, 
			y: 0,
		})
		.text("Grade:");
		
	var gradeRect = grade_g.append("g")
		.style("text-anchor", "start")
		.attr("transform", "translate(5, 10)");
	
	gradeRect.append("rect")
		.attr({
			x: 0,
			y: 0,
			width: 40,
			height: 30,
		})
		.attr("class", function(d) { return "graderect " + d[category].grade; });

	gradeRect.append("text")
		.style("text-anchor", "middle")
		.attr("class", "grade")
		.attr({
			x: 20,
			y: 26
		})
		.text(function(d) { return d[category].grade; });
}

function valueWithChange(g, startx, basey, space, invert, category, field, unit, valfixed, changefixed) {
	valueField(g, startx, basey, category, field, unit, valfixed);
	g.append("text")
		.style("text-anchor", "start")
		.attr("x", startx + 5)
		.attr("y", basey)
		.attr("class", function(d) {
				var val = null;
				if (!field)
					val = d[category][1];
				else
					val = d[category][field][1];
				if (!invert) {
					if (val < 0)
						return "negchange";
					else if (val > 0)
						return "poschange";
				} else {
					if (val > 0)
						return "negchange";
					else if (val < 0)
						return "poschange";
				}
				return "zerochange"
			})
		.text(function(d) { 
			if (!field)
				return "(" + d[category][1].toFixed(changefixed) + unit + ")";
			return "(" + d[category][field][1].toFixed(changefixed) + unit + ")"; 
		});
}

function valueField(g, startx, basey, category, field, unit, valfixed) {
	g.append("text")
		.style("text-anchor", "end")
		.attr("class", "value")
		.attr({
			x: startx,
			y: basey
		})
		.text(function(d) { 
			if(!field)
				return d[category][0].toFixed(valfixed) + unit;
			return d[category][field][0].toFixed(valfixed) + unit;
		});
}

function effortBox(container, transx, transy, letter) {
	var effort = container.append("g")
		.attr("transform", "translate(" + transx + ", " + transy +")");

	var effText = effort.append("g");
	effText.append("text")
		.attr("class", "subtitle")
		.attr("x", 0)
		.attr("y", 0)
		.text("Effort to Grade " + letter + ":");

	var effTextVal = effText.append("g")
		.attr("transform", "translate(10, 10)");

	valueWithChange(effTextVal, 45, 20, 50, 1, "effort", letter, "d");
}

function valueFieldWithHeader(container, headertype, header, headx, heady, spacer, invert, category, field, unit) {
	container.append("text")
		.attr("class", headertype)
		.attr({
			x: 0,
			y: heady
		})
		.text(header);

	valueWithChange(container, headx + 5, heady + 25, spacer, invert, category, field, unit);
}

function labelBox(container) {
	container.append("text")
		.attr("class", "label")
		.text(function(d) { return d.title; });

	container.append("text")
		.attr("class", "sublabel")
		.attr("dy", "1.4em")
		.text(function(d) { return d.subtitle; });
}