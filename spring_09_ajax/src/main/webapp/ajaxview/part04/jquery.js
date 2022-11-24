${document).ready(function() {
	$('#btn').click(process);
});

function process() {
	$.ajax({
		type:'GET',
		dataType:'text',
		url:'searchOpen.do?query='+$('#search').val(),
		success:viewMessage,
		error:function(xhr, textStatus, error) {
			alert(xhr.status);
		}
	});
}
		
function viewMessage(res) {
	alert(res);
}