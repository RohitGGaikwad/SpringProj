<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SampleWebProject/SignInServelet" method="post">
<pre>
<h1><center><font size="8" color="black">Sign In</font></center></h1>
Full Name:         <input type="text" name="Full_Name"><br>
Choose your Username:
                   <input type="text" name="User_name"><br>
Create Password:   <input type="text" name="Creat_Password" ><br>
Confirm Password:  <input type="text" name="Confirm_Password"><br>
Date Of Birth:     
Month:
 <select name="Month">
                                     <option value="Select">Select</option>
                                     <option value="January">January</option>
                                     <option value="Febuary">February</option>
                                     <option value="March">March</option>
                                     <option value="April">April</option>
                                     <option value="May">May</option>
                                     <option value="June">June</option>
                                     <option value="July">July</option>
                                     <option value="August">August</option>
                                     <option value="September">September</option>
                                     <option value="October">October</option>
                                     <option value="November">November</option>
                                     <option value="December">December</option>
                                     
                                     </select>
</br>
Day:      <input type="text" name="Day"><br>
Year:     <input type="text" name="Year" value=""size:"10"><br>
Gender:   <input type="radio" name="Gender"value="Male"/>Male
          <input type="radio" name="Gender"value="Female"/>Female
</br>
Mobile No: <input type="text" name="Mobile_No"><br> 
Your Current Email Address:
 <input type="text" name="CurrentEmailAddress"><br> 
State:
 <select name="Country">
                                     <option value="Select">Select</option>
                                     <option value="Maharashtra">Maharashtra</option>
                                     
                                     
                                     </select>
</br>

   <pre>            <input type="submit" value="Next"/> <input type="reset"value="clear"/></pre>
</pre>
</form>
</body>
</html>