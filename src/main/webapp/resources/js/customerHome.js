$(document).ready(function(){
	$(".myColorsdrop").hide();
	$(".myProducts").hide();
	$("#newRegister").hide();
	
	
	
});
var RegisterProductId = "";
$("#myColors").change(function (){
	var categoryId = "";
	categoryId = $("#myColors").val();
	if(categoryId!=""){
		
		$.ajax({
			method : 'Get',
			url : "getProduct",
			data :{id:categoryId},
			
			success : function(data) {
			    if(data.message=="success"){
			    	$(".myProducts").show();
			    	$('#myProducts').html("");
			    	var idNull="";
			    	var nameNull = "Select Product";
			    	var option = new Option(nameNull, idNull);
			    	$('#myProducts').append($(option));
			    	for(var i= 0;i<data.productList.length;i++){
						var id = data.productList[i].id;
						var name = data.productList[i].productname;
						var option = new Option(name, id); 
						$('#myProducts').append($(option));
						
						
					}
				}else{
			
			
				}
			    /*if(data.productList.length==0){
			    	alert("hi");
			    	
			    }*/

			},

			error : function(xhr, error) {
				console.log(xhr, error);
			

			}


		});
		}
	});

$("#myProducts").change(function (){
	var productId = "";
	productId = $("#myProducts").val();
	if(productId!=""){
		RegisterProductId = productId;
		$.ajax({
			method : 'Get',
			url : "getProductModel",
			data :{id:productId},
			
			success : function(data) {
			    if(data.message=="success"){
			    	$("#newRegister").show();
			    	$('#productModel').html("");
			    	var idNull="";
			    	var nameNull = "Select Model";
			    	var option = new Option(nameNull, idNull);
			    	$('#productModel').append($(option));
			    	for(var i= 0;i<data.productModelList.length;i++){
						var id = data.productModelList[i].id;
						var name = data.productModelList[i].modelName;
						var option = new Option(name, id); 
						$('#productModel').append($(option));
						
						
						
					}
				}else{
			
			
				}
			   

			},

			error : function(xhr, error) {
				console.log(xhr, error);
			

			}


		});
		}
	});

$("#RegisterRequest").click(function(){
	var success = true;
	var message = {};
	$('#errorMessage').removeClass("error_class");
	$('#errorMessage').removeClass("save_class");
	
	var description = $("#faultDesc").val();
	
	if ($.trim(description) == "") {
		$('#errorMessageRegister').addClass("error_class");
		$('#errorMessageRegister').html("Fault description required");
		$('#errorMessageRegister').css("background", "yellow");
		//$('#firstName').css("border-bottom", "1px solid red");
		success = false;
		return;

	} else {

		if(checkHtmRegex(description)){
			message.repairdesc = description;
		}else{
			
			//alert("Invalid firstname");
			$('#errorMessageRegister').addClass("error_class");
			$('#errorMessageRegister').html("Invalid Description");
			$('#errorMessageRegister').css("background", "yellow");
			//$('#firstName').css("border-bottom", "1px solid red");
			success = false;
			return;
		}
	}
	
	var accesories = $("#Accesories").val();
	if(checkHtmRegex(accesories)){
		message.accesories = accesories;
	}else{
		//alert("Invalid lastname");
		$('#errorMessageRegister').addClass("error_class");
		$('#errorMessageRegister').html("Invalid Accesory name");
		$('#errorMessageRegister').css("background", "yellow");
		//$('#lastName').css("border-bottom", "1px solid red");
		success = false;
		return;
	}
	/*if(accesories==""){
		$("#confirmationModal").modal('show');
		
		
	}*/
	
	
	var productModel = $("#productModel").val();
	if(productModel==""){
		$('#errorMessageRegister').addClass("error_class");
		$('#errorMessageRegister').html("Select the product model");
		$('#errorMessageRegister').css("background", "yellow");
		//$('#lastName').css("border-bottom", "1px solid red");
		success = false;
		return;
		
		
	}else{
		message.modelid=productModel;
	}
	if(RegisterProductId!=""){
		message.productid=RegisterProductId;
	}else{
		alert("productId changed");
		success = false;
		return;
	}
	if (success) {
		var uploadAttachment = new FormData();
		uploadAttachment.append('threadPid', JSON.stringify(message));
		$.ajax({
			method : 'POST',
			url : "repairRequest",
			data : uploadAttachment,
			cache : false,
			contentType : false,
			processData : false,
			success : function(data) {
			
			    if(data.message=="success"){
			    	
			    	
						
					
				}

			
		else{
			
			
				}

			},

			error : function(xhr, error) {
				console.log(xhr, error);
				

			}


		});
	}
	
	
	
	
	
});

$("#faultDesc").focus(function(){
	$('#errorMessageRegister').html("");
	$('#errorMessageRegister').css("background", "none");
	//$('#firstName').css("border-bottom", "1px solid white");

});
$("#productModel").focus(function(){
	$('#errorMessageRegister').html("");
	$('#errorMessageRegister').css("background", "none");
	//$('#firstName').css("border-bottom", "1px solid white");

});


	
$("#newRequest").click(function(){
	
	$.ajax({
		method : 'Get',
		url : "getCategory",
		
		success : function(data) {
		
		    if(data.message=="success"){
		    	$(".myColorsdrop").show(); 
		    	$('#myColors').html("");
		    	var idNull="";
		    	var nameNull = "Select Category";
		    	var option = new Option(nameNull, idNull); 
				$('#myColors').append($(option));
		    	
		    
					for(var i= 0;i<data.categoryNames.length;i++){
						var id = data.categoryNames[i].id;
						var name = data.categoryNames[i].categoryname;
						var option = new Option(name, id); 
						$('#myColors').append($(option));
						
						
					}
				
			}else{
		
		
			}

		},

		error : function(xhr, error) {
			console.log(xhr, error);
		

		}


	});
	
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