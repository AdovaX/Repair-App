
$(document).ready(function(){
	
});

$("#signUp").click(function(){
	
	var success = true;
	var message = {};
	//$('#errorMessage').removeClass("error_class");
	//$('#errorMessage').removeClass("save_class");
	//var image = $('#file-1')[0].files[0];

	var firstname = $('#firstname').val();
	//alert(firstname);
	var email="";
	if ($.trim(firstname) == "") {
		alert("firstname error");
		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Firstname required");
		//$('#firstName').css("border-bottom", "1px solid red");
		success = false;

	} else {

		if(checkHtmRegex(firstname)){
			message.firstname = $('#firstname').val();
		}else{
			
			alert("firstname html error");
			//$('#errorMessage').addClass("error_class");
			//$('#errorMessage').html("Invalid First Name");
			//$('#firstName').css("border-bottom", "1px solid red");
			success = false;
		}
	}
	var lastName=$('#lastname').val();

	if(checkHtmRegex(lastName)){
		message.lastname = $('#lastname').val();
	}else{
		alert("lastname html error");
		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Invalid Last Name");
		//$('#lastName').css("border-bottom", "1px solid red");
		success = false;
	}



	/*if ($("#maleRadioBtn").prop("checked")) {
		message.gender = "male";
	} else {
		message.gender = "female";
	}*/
	var username = $('#username').val();
	if ($.trim(username) == "") {
		alert("username error");
		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Username required");
		//$('#userName').css("border-bottom", "1px solid red");
		success = false;

	} else {

		if(checkHtmRegex($('#username').val())){
			message.username = $('#username').val();
		}else{
			alert("username html error");
			//$('#errorMessage').addClass("error_class");
			//$('#errorMessage').html("Invalid Username");
			//$('#userName').css("border-bottom", "1px solid red");
			success = false;
		}
	}
	var emailId = $('#email').val();
	if ($.trim(emailId) == "") {
		alert("emailid error");
		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Email address required");
		//$('#emailId').css("border-bottom", "1px solid red");

		success = false;

	}
	else{

		if(IsEmail($('#email').val())){

			message.email = $('#email').val().toLowerCase();

		}
		else{
			alert("emailid check error");
			//$('#errorMessage').addClass("error_class");
			//$('#errorMessage').html("Email address is incorrect");
			//$('#emailId').css("border-bottom", "1px solid red");
			success = false;
		}

	}
	var password = $('#password').val();

	if ($('#password').val().length<6) {
		alert("password length error");
		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Password must contain 6 characters");
		//$('#password').css("border-bottom", "1px solid red");
		success = false;
	}
	if ($.trim(password) == "") {
		alert("password  error");
		//$('#errorMessage').addClass("error_class");

		//$('#errorMessage').html("Password required");
		//$('#password').css("border-bottom", "1px solid red");
		success = false;

	} else {
		message.password = $('#password').val();
	}
	var password2 = $('#confirmpassword').val();
	if ($.trim(password2) == "") {
		alert("cnfrm pswd error");
		//$('#errorMessage').addClass("error_class");
		//$('#password2').css("border-bottom", "1px solid red");

		//$('#errorMessage').html("Confirm password required");
		success = false;

	}

	var password = $("#password").val();

	var regex = /[\u3000-\u303F]|[\u3040-\u309F]|[\u30A0-\u30FF]|[\uFF00-\uFFEF]|[\u4E00-\u9FAF]|[\u2605-\u2606]|[\u2190-\u2195]|\u203B/g; 
	//password validation Req from user 
	if(regex.test(password)){
		alert("password regx error");

		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Password accepts only alpha numeric or special characters");
		//$('#password').css("border-bottom", "1px solid red");

		success = false;

	}

	var password = $("#password").val();
	var confirmPassword = $("#confirmpassword").val();

	if (password != confirmPassword) {
		alert("password equal error");
		//$('#errorMessage').addClass("error_class");
		//$('#errorMessage').html("Password doesn't match");
		//$('#password').css("border-bottom", "1px solid red");
		//$('#password2').css("border-bottom", "1px solid red");
		success = false;

	} else {
		message.password = $('#password').val();
	}


	/*$("#firstName").focus(function(){
		$('#errorMessage').html("");
		$('#firstName').css("border-bottom", "1px solid white");

	});
	$("#lastName").focus(function(){
		$('#errorMessage').html("");
		$('#lastName').css("border-bottom", "1px solid white");

	});
	$("#userName").focus(function(){
		$('#errorMessage').html("");
		$('#userName').css("border-bottom", "1px solid white");

	});
	$("#emailId").focus(function(){
		$('#errorMessage').html("");
		$('#emailId').css("border-bottom", "1px solid white");

	});
	$("#password").focus(function(){
		$('#errorMessage').html("");
		$('#password').css("border-bottom", "1px solid white");
		$('#password2').css("border-bottom", "1px solid white");

	});
	$("#password2").focus(function(){
		$('#errorMessage').html("");
		$('#password2').css("border-bottom", "1px solid white");
		$('#password').css("border-bottom", "1px solid white");

	});
*/

	if (success) {
		//$("#register").attr("disabled", "disabled");
		
		var uploadAttachment = new FormData();
		//uploadAttachment.append("file", image);
		uploadAttachment.append('threadPid', JSON.stringify(message));

		//var messageContextPath = "signUp";
		$.ajax({
			method : 'POST',
			url : "/register",
			data : uploadAttachment,
			cache : false,
			contentType : false,
			processData : false,
			success : function(data) {
				alert("returneed");
				/*if(data.status == "Username is already taken"){

					$('#errorMessage').addClass("error_class");
					$('#errorMessage').html("This Username already exists");
					$('#userName').css("border-bottom", "1px solid red");
					$("#register").removeAttr("disabled", "");
					success=false;

				}*/
			    if(data.message=="success"){
					alert("success");
					
				}
				/*else if(data.status == "Username/EmailId is already taken!"){
					$('#errorMessage').addClass("error_class");
					$('#errorMessage').html("Username/EmailId is already taken!");
					$('#emailId').css("border-bottom", "1px solid red");
					$("#register").removeAttr("disabled", "");

					success=false;
				}*/
				/*else if(data.status=="deregisteredUser"){

					$('#activateAccountBtn').prop('disabled', false);
					$('#restoreEmail').html(data.email);
					$('#errorMessageDiv').hide();
					$('#restoreUsername').html(data.userName);
					$('#errorMessageAcivate').html("");
					$('.activate_acc_div').show();
					$('#activateAccountBtn').show();
					$('#activateAccTokenDiv').hide();
					$('#submitToken').hide();
					$('.errorMessageDiv').hide();

					$('#otpModalDismiss').html("NO"); 
					$('#otpModalDismiss').css("width","80px");
					$('#otpModalDismiss').css("padding-left","30px");

					$('#accountActivateConfirm').modal('show');
					$("#register").removeAttr("disabled", "");
	            	
	            }*//*else if(data.status=="accountSuccessfullyActivated" || data.status=="New user Registered..!!!"){
					$('#errorMessage').addClass("save_class");
					$('#errorMessage').html(data.status);
					setTimeout(function() {
						window.location.href = 'login';
						$('#errorMessage').html("");
					}, 1000);*/
				//}
		else{
			alert("false");
					//$('#errorMessage').addClass("error_class");
					//$('#errorMessage').html("Unexpected error occurred");
				}

			},

			error : function(xhr, error) {
				console.log(xhr, error);
				alert("errorrrr");
				//$('#errorMessage').addClass("error_class");
				//$('#errorMessage').html("Unexpected error occurred while saving user details");
				//$("#register").removeAttr("disabled", "");

			}


		});


	}
	
});


function checkHtmRegex(checkValue){

	//check for html
	var checkExp =/<(.|\n)*?>/g; 

	if (checkExp.test(checkValue) == true) {

		return false;

	}else{
		return true;
	}
}
function IsEmail(email) {

	var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!regex.test(email)) {

		return false;
	} else {
		return true;
	}
}



