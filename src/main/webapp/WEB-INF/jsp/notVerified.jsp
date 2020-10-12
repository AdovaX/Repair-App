<!-- Your account is not verified

<button type="button" id="reVerify">ressent verification link</button> -->


<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Verify account</title>


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

      <div class="col-xl-6 col-lg-12 col-md-9">

        <div class="card o-hidden border-0 shadow-lg my-5">
          <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
             
              <div class="col-lg-12">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-2">Please verify your account</h1>
                    <p class="mb-4">Check your registered email account to verify the account</p>
                  </div>
                  <form class="user">
                   <!--  <div class="form-group">
                      <input type="email" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address...">
                    </div> -->
                   
                    
					<button type="button" class="btn btn-primary btn-user btn-block" id="reVerify">Resent verification link</button>

                  </form>
                  <hr>
                  
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

    <spring:url value="/resources/js/verifyAccount.js" var="verifyAccount"></spring:url>
  <script type="text/javascript" src="${verifyAccount}"></script>


</body>

</html>
