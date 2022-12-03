$(document).ready(function() {

	const json = './json/data.json';
	$.getJSON(json, function(data) {

		// 할 일 처리
		let member_data = "";
		$.each(data, function(key, value) {
			member_data += "<tr>";
			member_data += "<td>" + value.id + "</td>";
			member_data += "<td>" + value.name + "</td>";
			member_data += "<td>" + value.tel + "</td>";
			member_data += "<td>" + value.homepage + "</td>";
			member_data += "</tr>";
		});
		$('#member_table').append(member_data);

		/*
		$.each( data, function( key, value ) {
			console.log( value.id );
			console.log( value.name );
			console.log( value.tel );
			console.log( value.homepage );
			$( 'table' ).attr( 'border', '10' );
			$( 'tbody' ).append(
					"<tr>" +
							"<td>"+ value.id +"</td>" +
							"<td>"+ value.name +"</td>" +
							"<td>"+ value.tel +"</td>" +
							"<td>"+ value.homepage +"</td>" +
					"</tr>"
			);			
		} );
		*/
	});

});





