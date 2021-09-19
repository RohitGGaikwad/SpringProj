<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Education</title>
<script>
function checkInput(){
	var nameUsingId=document.getElementById("Passing_From").value;
	if(nameUsingId==""){
		alert("Enter your Passing_From");
		return false;
	}
	var nameUsingId=document.getElementById("Year_Of_Passing").value;
	if(nameUsingId==""){
		alert("Enter your Year_Of_Passing");
		return false;
	}
	var nameUsingId=document.getElementById("Percentage").value;
	if(nameUsingId==""){
		alert("Enter your Percentage");
		return false;
	}
	var nameUsingId=document.getElementById("HSC_Passing_From").value;
	if(nameUsingId==""){
		alert("Enter your HSC_Passing_From");
		return false;
	}
	var nameUsingId=document.getElementById("Year_Of_Passing_HSC").value;
	if(nameUsingId==""){
		alert("Enter your Year_Of_Passing_HSC");
		return false;
	
	}
	var nameUsingId=document.getElementById("Percentage_HSC").value;
	if(nameUsingId==""){
		alert("Enter your Percentage_HSC");
		return false;
	}
	var nameUsingId=document.getElementById("Pass_Out_Year").value;
	if(nameUsingId==""){
		alert("Enter your Year_Of Pass_Out_Year");
		return false;
	}
	var nameUsingId=document.getElementById("University").value;
	if(nameUsingId==""){
		alert("Enter your University");
		return false;
	}
	var nameUsingId=document.getElementById("Admission_From_No").value;
	if(nameUsingId==""){
		alert("Enter your Admission_From_No");
		return false;
	}
}
</script>
</head>
<body>
<h1><center><font size="6" color="black">Education Information</font></center></h1>
<form action="/SampleWebProject/EducationServelet" method="post"><pre>
<h3>SSC Info: </h3>              
Passing From:           <input type="text" name="Passing_From" id="Passing_From"><br>
Pass Out Year:          <input type="text" name="Year_Of_Passing"id="Year_Of_Passing"><br>
Percentage:             <input type="text" name="Percentage"id="Percentage"></pre>
<pre>
 <H3>HSC Info:</H3>
 HSC Passing From:      <input type="text" name="HSC_Passing_From"id="HSC_Passing_From"><br> 
HSC Pass Out Year :     <input type="text" name="Year_Of_Passing_HSC"id="Year_Of_Passing_HSC"><br>
HSC Percentage :        <input type="text" name="Percentage_HSC"id="Percentage_HSC"></pre>
<pre>
 Pass Out Degree:
                        <select name="Pass_Out_Year" id="Pass_Out_Year"><br>
                                     <option value="">Select your Pass Out Year</option>
                                     <option value="InProgress">In Progress</option>
                                     <option value="Completed">Completed</option>
                                     <option value="Termineted">Terminated</option></pre>                                 
                                     </select>
<pre>
University:             <input type="text" name="University"id="University"></pre>
Admission Form NO:      <input type="text" name="Admission_From_No"id="Admission_From_No">
   <pre>                <input type="submit" value="Submit"onclick="checkInput();"/> <input type="reset"value="clear"/></pre><br>
</form>
</body>
</html>