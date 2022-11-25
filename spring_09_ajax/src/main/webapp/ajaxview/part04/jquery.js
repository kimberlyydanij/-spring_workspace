$(document).ready(function() {
	$('#btn').click(process);
});

function process() {
	$.ajax({
		type: 'GET',
		url: https://dapi.kakao.com/v3/search/book?target=title',
		headers:{"Authorization": "KakaoAK 22144f9f7b86e6ce124b91941228882c"},
		dataYype:'json',
		data:{"query": $('#query').val()},
		sucess:viewMessage
		
	});
}
		
function viewMessage(res) {
	//console.log(res);
	//alert(res.documents[0].title);
	
	$.each(res.documents, function(index, element){
		$('#wrap table').append(`<tr><td>${element.title}</td><td><a href="${element.url}"><img src="${element.thumbnail}"</a></td><td>${element.price}</td></tr>`);
	} );
}