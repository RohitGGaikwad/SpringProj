<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center><font size="6" color="black">Search</font></center></h1>
<form action="/SampleWebProject/SearchServelet" method="post">
<pre>
 Name:               <input type="text" name="FullName"><br>
 Surname:            <input type="text" name="Surname"><br>
 Mother Name:        <input type="text" name="MotherName"><br>
 Adhar No:           <input type="text" name="AdharNo"><br>

   <pre>            <input type="submit" value="Submit"/> <input type="reset"value="clear"/></pre>
</pre>
</form>
</body>
</html>