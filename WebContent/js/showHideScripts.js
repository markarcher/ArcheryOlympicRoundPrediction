$(document).ready(function(){	
	$('#noOfArchers').click(function(){
		$('#archersAndRank').removeClass('hidden');
		$('#archersAndRank').show();		  
		  var rows = parseInt($("#noOfArchersTextBox").val(), 10);
		  var html = '';
		  for (var i = 0; i < rows; i++) {
		    html += '<tr>' +
		      '<td>' + (i + 1) + '</td>' +
		      '<td><input type="name" placeholder="text goes here..."></td>' +
		      '<td><input type="name" placeholder="text goes here..."></td>' +
		      '</tr>';
		  }
		  $('table').html(html);
	});
	
	$('#predict').click(function(){
		/*alert("predict");
		$('#resultTable .archerNameCELL').each(function()
				{
				  alert($(this).html());
				});*/
		/*$('#resultTable tr').each(function() {
		    var archerName = $(this).find('td').html();    
		    alert(archerName);
		 });*/
		
		/*$('table tr td').each(function(){
			
			var texto = $(this).text();
			alert(texto);
		});*/
	});
});