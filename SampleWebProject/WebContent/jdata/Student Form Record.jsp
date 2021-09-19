<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form Record</title>
<script>
function checkInput(){
	var nameUsingId=document.getElementById("Name").value;
	if(nameUsingId==""){
		alert("Enter your Name");
		return false;
	}
	var nameUsingId=document.getElementById("RegisterNo").value;
	if(nameUsingId==""){
		alert("Enter your Register_No");
		return false;
	}
	var nameUsingId=document.getElementById("ClassDepartment").value;
	if(nameUsingId==""){
		alert("Enter your ClassDepartment");
		return false;
	}
	var nameUsingId=document.getElementById("phoneNo").value;
	if(nameUsingId==""){
		alert("Enter your phone_No");
		return false;
	}
	
}
</script>
</head>
<body>
<h1><center><font color="black">Student form Record</font></center> </h1>
<form action="/SampleWebProject/StudFRServlet">
<pre>name:                      <input  type="text"name="Name" id="Name"></pre>
<pre>Register No:               <input type="text"name="Register_No" id="RegisterNo"></pre>
Select Your Class/Department:                       
                                                    <select name ="ClassDepartment">
                                                    <option value="11th Science">11th Science</Option>
                                                    <option value="11th Commerce">11th Commerce</Option>
                                                    <option value="11th Art">11th Art</Option>
                                                    <option value="12th Science">12th Science</Option>
                                                    <option value="12th Commerce">12th Commerce</Option>
                                                    <option value="12th Art">12th Art</Option>
                                                    <option value="B.C.A">B.C.A</Option>
                                                    <option value="B.Sc">B.Sc</Option>
                                                    <option value="M.Sc">M.Sc</Option>
                                                    <option value="B.A">B.A</Option>
                                                    <option value="M.A">M.A</Option>
                                                    <option value="B.Com">B.Com</Option>
                                                    <option value="M.Com">M.Com</Option>
                                                                                       </select>
<pre>Phone No:                  <input type="text"name="phone_No" id="phoneNo"></pre>
<pre>              <input type="submit"value="submit"onclick="checkInput();"/> <input type="reset" value="clear"/></pre>


</form>

</body>
</head>
</html>