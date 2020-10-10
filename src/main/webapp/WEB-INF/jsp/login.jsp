<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Login</title>

  <!-- Custom fonts for this template-->
  <spring:url value="/resources/vendor/fontawesome-free/css/all.min.css" var="allCSS"></spring:url>
  <link rel="stylesheet" href="${allCSS}">

  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
 <spring:url value="/resources/css/sb-admin-2.min.css" var="sbadmin2"></spring:url>
 <link rel="stylesheet" href="${sbadmin2}">



</head>

<body class="bg-gradient-primary">

  <div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

      <div class="col-xl-10 col-lg-12 col-md-9">

        <div class="card o-hidden border-0 shadow-lg my-5">
          <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
              <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
              <div class="col-lg-6">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                  </div>
                  <form class="user" action="/login" method="POST">
                    <div class="form-group">
                      <input type="email" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address...">
                    </div>
                    <div class="form-group">
                      <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
                    </div>
                    <div class="form-group">
                      <div class="custom-control custom-checkbox small">
                        <input type="checkbox" class="custom-control-input" id="customCheck">
                        <label class="custom-control-label" for="customCheck">Remember Me</label>
                      </div>
                    </div>
              <!--       <a href="index.html" class="btn btn-primary btn-user btn-block">
                      Login
                    </a> -->
                    
                      <input type="submit" value="Login" id="login" class="btn btn-primary btn-user btn-block">

                    <hr>
                    <a href="#" class="btn btn-google btn-user btn-block">
                      <i class="fab fa-google fa-fw"></i> Login with Google
                    </a>
                    <a href="#" class="btn btn-facebook btn-user btn-block">
                      <i class="fab fa-facebook-f fa-fw"></i> Login with Facebook
                    </a>
                  </form>
                  <hr>
                  <div class="text-center">
                    <a class="small" href="#">Forgot Password?</a>
                  </div>
                  <div class="text-center">
                    <a class="small" href="signUpPage">Create an Account!</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>

    </div>

  </div>

  <!-- Bootstrap core JavaScript-->

 <!--  <script src="/resources/vendor/jquery/jquery.min.js"></script> -->
  <spring:url value="/resources/vendor/jquery/jquery.min.js" var="jquery"></spring:url>
  <script type="text/javascript" src="${jquery}"></script>
<!-- 
  <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script> -->

  <spring:url value="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js" var="bootstrap"></spring:url>
  <script type="text/javascript" src="${bootstrap}"></script>


  <!-- Core plugin JavaScript-->
 <!--  <script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
  -->
  <spring:url value="/resources/vendor/jquery-easing/jquery.easing.min.js" var="jqueryEasing"></spring:url>
  <script type="text/javascript" src="${jqueryEasing}"></script> 
  <!-- Custom scripts for all pages-->
<!--   <script src="/resources/js/sb-admin-2.min.js"></script> -->
  <spring:url value="/resources/js/sb-admin-2.min.js" var="sbadmin2Min"></spring:url>
  <script type="text/javascript" src="${sbadmin2Min}"></script>


</body>

</html>
