<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - signup</title>

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

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
              </div>
              <!-- <form class="user"> -->
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" id="firstname" placeholder="First Name" autocomplete="off">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="lastname" placeholder="Last Name" autocomplete="off">
                  </div>
                </div>

                <div class="form-group">
                  <input type="email" class="form-control form-control-user" id="email" placeholder="Email Address" autocomplete="off">
                </div>

                  <!-- gender -->
                 <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <div class="custom-control custom-radio custom-control-solid">
                     <input class="custom-control-input" id="maleRadioBtn" checked="checked" type="radio" name="gender">
                      <label class="custom-control-label" for="maleRadioBtn">Male</label>
                    </div>
                  </div>
                  <div class="col-sm-6">
                     <div class="custom-control custom-radio custom-control-solid">
                       <input class="custom-control-input" id="femaleRadioBtn" type="radio" name="gender">
                        <label class="custom-control-label" for="femaleRadioBtn">Fenale</label>
                      </div>
                  </div>
                </div>

                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="password" class="form-control form-control-user" id="password" placeholder="Password" autocomplete="off">
                  </div>
                  <div class="col-sm-6">
                    <input type="password" class="form-control form-control-user" id="confirmpassword" placeholder="Repeat Password" autocomplete="off">
                  </div>
                </div>

                <div class="form-group" style="height:15px;color: red">
                    <span id="errorMessage" class="error_msg_span_register" ></span>
                </div>


                <Button id="signUp" class="btn btn-primary btn-user btn-block">Sign up</Button>
                <hr>
                <a href="#" class="btn btn-google btn-user btn-block">
                  <i class="fab fa-google fa-fw"></i> Register with Google
                </a>
                <a href="#" class="btn btn-facebook btn-user btn-block">
                  <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                </a>
            <!--   </form> -->
              <hr>
              <div class="text-center">
                <a class="small" href="#">Forgot Password?</a>
              </div>
              <div class="text-center">
                <a class="small" href="login">Already have an account? Login!</a>
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

  <spring:url value="/resources/js/login.js" var="login"></spring:url>
  <script type="text/javascript" src="${login}"></script>

</body>

</html>
