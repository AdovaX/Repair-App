$('#reVerify').click(function () {
	
	$.ajax({
			method : 'POST',
			url : "resendVerificationEmail",
			cache : false,
			contentType : false,
			processData : false,
			success : function(data) {
				
	alert("succ");

			},

			error : function(xhr, error) {
				console.log(xhr, error);
			}


		});

})


