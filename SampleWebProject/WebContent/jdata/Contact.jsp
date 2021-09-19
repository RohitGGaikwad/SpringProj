<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact</title>
<script>
function checkInput(){
	var nameUsingId=document.getElementById("Guardian_Name").value;
	if(nameUsingId==""){
		alert("Enter your Guardian_Name");
		return false;
	}
	var nameUsingId=document.getElementById("Guardian_Phn_No").value;
	if(nameUsingId==""){
		alert("Enter your Guardian_Phn_No");
		return false;
	}
	var nameUsingId=document.getElementById("Guardian_Tel_No").value;
	if(nameUsingId==""){
		alert("Enter your Guardian_Tel_No");
		return false;
	}
	var nameUsingId=document.getElementById("Address").value;
	if(nameUsingId==""){
		alert("Enter your Address");
		return false;
	}
	var nameUsingId=document.getElementById("Email").value;
	if(nameUsingId==""){
		alert("Enter your Email");
		return false;
	}
	
}
</script>
</head>
<body>
<h1><center><font color="black"> contact Form</font></center> </h1>

<form action="/SampleWebProject/ContactServelet1" method="post">
<table border="1" align="center">
<td>
<tr>
<pre>
Guardian Name:      <input type="text" name="Guardian_Name" id="Guardian_Name"><br>
Guardian Phn-No:    <input type="text" name="Guardian_Phn_No"  id="Guardian_Phn_No"><br>
Guardian Tel-No:    <input type="text" name="Guardian_Tel_No" id="Guardian_Tel_No"><br>
Address:            <input type="text" name="Address" id=Address><br>
E-Mail:             <input type="text" name="Email" id="Email"><br>
<pre>         <input type="submit" value="Submit"onclick="checkInput();"/> <input type="reset" value="clear"/></pre>
</td>
</tr>
</table>
</form>
</body>
</html>