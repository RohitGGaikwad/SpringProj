<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fees</title>
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
	var nameUsingId=document.getElementById("Transaction_Date").value;
	if(nameUsingId==""){
		alert("Enter your Transaction_Date");
		return false;
	}
	
}
</script>

</head>
<body>
<h1><center><font color="black">Student fees Record</font></center> </h1>
<form action="/SampleWebProject/FeesServelt" method="post">
<pre>Register No:          <input type="text" name="Register_No" id="Register_No"></pre>
<pre>Amount:               <input type="Number"name="Amount" id="Amount"></pre>
<pre>Description:          <textarea name="Comment"rows="2" cols="25"> </textarea>
<pre>Transaction Date:     <input type="text"name="Transaction_Date" id="Transaction_Date"></pre>
<pre>              <input type="submit"value="submit" onclick="checkInput();"/> <input type="reset" value="clear"/></pre>
</form>

</body>
</html> 