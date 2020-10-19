$(document).ready(function(){
	$(".myColorsdrop").hide();
	$(".myProducts").hide();
	
});

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
				
			}
			
	else{
		
		
			}

		},

		error : function(xhr, error) {
			console.log(xhr, error);
		

		}


	});
	
});