<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fine</title>
<script>
function checkInput(){
	var nameUsingId=document.getElementById("Register_No").value;
	if(nameUsingId==""){
		alert("Enter your Register_No");
		return false;
	}
	var nameUsingId=document.getElementById("Amount").value;
	if(nameUsingId==""){
		alert("Enter your Amount");
		return false;
	}
	
	
}
</script>

</head>
<body>
<table border="1" cellspacing="0"><tr>
<th colspan="2"><h1><center><font color="black">Student fine Record</font></center> </h1></th></tr>
<form action="/SampleWebProject/FineServlet">
<tr><th>Register No:</th>         <td> <input  type="Text"name="Register_No" id="Register_No"></td></tr>
<tr><th>Amount:</th>               <td><input type="text"name="Amount" id="Amount"></td></tr>
<tr><th>Equipment:</th>          <td><textarea name="Comment"rows="2" cols="25"> </textarea></td></tr>
<tr><td><input type="submit"value="submit" onclick="checkInput();"/></td> <td><input type="reset" value="clear"/></td></tr>
</form>
</body>
</html>