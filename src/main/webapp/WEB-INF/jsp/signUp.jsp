


 <!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>SignUp Page</title>
	
	<spring:url value="/resources/css/signUp.css" var="loginCss"></spring:url>
    <link rel="stylesheet" href="${loginCss}">
     
    
    
   <!--Made with love by Mutiullah Samim -->
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

	
   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	
</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign Up</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
				
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="Firstname" id="firstname" autocomplete="off">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="Lastname" id="lastname" autocomplete="off">
					</div>
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="Username" id="username" autocomplete="off">
					</div>
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-male"></i></span>
						</div>
						<div class="gender_div_male"><input type="radio" name="gender" id="maleRadioBtn"  checked="checked" style="margin-left:62px;"><span>Male</span> </div>
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-female"></i></span>
						</div>
						<div class="gender_div_female"><input type="radio" name="gender"  id="femaleRadioBtn" style="margin-left:65px;"><span>Female</span></div>
					</div>
					
					<!-- <div class="form-group label-floating text_box_div">
							<div class="gender_div">
								<div class="gender_div_male"><input type="radio" name="gender" id="maleRadioBtn" value="male" checked="checked" style="margin-left:52px;"> <span>Male</span></div>
								<div class="gender_div_female"><input type="radio" name="gender"  id="femaleRadioBtn" value="female" style="margin-left:65px;"> <span>Female</span></div>
                        	</div> -->
                        	
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-envelope"></i></span>
						</div>
						<input type="email" class="form-control" placeholder="email" id="email" autocomplete="off">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password" id="password" autocomplete="off">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="confirm password" id="confirmpassword" autocomplete="off">
					</div>
					<!-- <div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div> -->
					<div class="form-group">
						<Button id="signUp" class="btn float-right login_btn">signUp</Button>
					</div>
				
			</div>
			<span id="errorMessage" class="error_msg_span_register"></span>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					<a href="login">Sign In</a>
				</div>
				<!-- <div class="d-flex justify-content-center">
					<a href="#">Forgot your password?</a>
				</div> -->
			</div>
		</div>
	</div>
</div>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<spring:url value="/resources/js/login.js" var="loginjs"></spring:url>
     <script type="text/javascript" src="${loginjs}"></script>


</body>
</html>