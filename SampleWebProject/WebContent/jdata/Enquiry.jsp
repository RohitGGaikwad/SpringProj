<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact</title>
<script>
function checkInput(){
	var nameUsingId=document.getElementById("Full_Name").value;
	if(nameUsingId==""){
		alert("Enter your Full_Name");
		return false;
	}
	var nameUsingId=document.getElementById("Contact_No").value;
	if(nameUsingId==""){
		alert("Enter your Contact_No");
		return false;
	}
	var nameUsingId=document.getElementById("Email").value;
	if(nameUsingId==""){
		alert("Enter your Email");
		return false;
	}
	var nameUsingId=document.getElementById("Address").value;
	if(nameUsingId==""){
		alert("Enter your Address");
		return false;
	}
	var UserQueryUsingId=document.getElementById("UserQuery").value;
	if(UserQueryUsingId==""){
		alert("Enter your Query");
		return false;
	}
	 return true;
	
}
</script>
</head>
<body>
<h1><center><font color="black"> Enquiry Form</font></center> </h1>

<form action="/SampleWebProject/EnquiryServelet" method="post">
<table border="1" align="center">
<td>
<tr>
<pre>
Full Name:     <input type="text" name="Full_Name" id="Full_Name"><br>
Contact No:    <input type="text" name="Contact_No"  id="Contact_No"><br>
Email:         <input type="text" name="Email" id="Email"><br>
Address:       <input type="text" name="Address" id=Address><br>
Query:       
               <textarea name="UserQuery" id="UserQuery" rows="8" cols="80"></textarea>
<pre>          <input type="submit" value="Submit"onclick="return checkInput();"/> <input type="reset" value="clear"/></pre>
</td>
</tr>
</table>
</form>
</body>
</html>