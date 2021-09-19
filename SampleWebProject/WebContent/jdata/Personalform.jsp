<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Form</title>
</head>
<body>

<h1><center><font colour="Black">Personal Info</center></font></h1>
<form action="/SampleWebProject/PersonalServlet">
<pre>First Name:  <input type="text"name="First_Name" size="10">        Middle Name:<input type="text"name="Middle_Name" size="10">       Last Name:<input type="text"name="Last_Name" value=""size="10"></pre>
<pre>Mother Name: <input type="text" name="Mother_Name" size="10">      
<pre>P_Address:   <input type="text" name="P_Address" size="80"></pre>
<pre>Mob_No:      <input type="text" name="Mob_No"size="40">            Tel_No:    <input type="text" name="Tel_No" size="40"></pre>
<pre>Gender:      <input type="radio"name="Gender"value="Male"/>Male       <input type="radio"name="Gender"value="Female"/>Female 

<pre>City:        <input type="text" name="City" value=""size="25">     Tal: <input type="text" name="Tal" value=""size="25"></pre> 
<pre>Dist:        <Select name="Dist">
                   <option value="">Dist</option>
                   <option value="Ahmednagar">Ahmednagar</option>
                   <option value="Akola">Akola</option>
                   <option value="Amravati">Amravati</option>
                   <option value="Aurangabad">Aurangabad</option>
                   <option value="Beed">Beed</option>
                   <option value="Bhandara">Bhandara</option>
                   <option value="Buldhana">Buldhana</option>
                   <option value="Chandrapur">Chandrapur</option>
                   <option value="Dhule">Dhule</option>
                   <option value="Gadchiroli">Gadchiroli</option>
                   <option value="Gondiya">Gondiya</option>
                   <option value="Hingoli">Hingoli</option>
                   <option value="Jalgav">Jalgav</option>
                   <option value="Jalna">Jalna</option>
                   <option value="Kolhapur">Kolhapur</option>
                   <option value="Mumbai">Latur</option>
                   <option value="Mumbai City">Mumbai City</option>
                   <option value="Mumbai SubUrban">Mumbai SubUrban</option>
                   <option value="Nagpur">Nagpur</option>
                   <option value="Nanded">Nanded</option>
                   <option value="Nandurbar">Nandurbar</option>
                   <option value="Nashik">Nashik</option>
                   <option value="Usmanabad">Usmanabad</option>
                   <option value="Parbhani">Parbhani</option>
                   <option value="Pune">Pune</option>
                   <option value="Ratnagiri">Ratnagiri</option>
                   <option value="Sangali">Sangali</option>
                   <option value="Satara">Satara</option>
                   <option value="Sindhudurg">Sindhudurg</option>
                   <option value="Solapur">Solapur</option>
                   <option value="Thane">Thane</option>
                   <option value="Wardha">Wardha</option>
                   <option value="Vashi">Vashi</option>
                   <option value="Palghar">Palghar</option>                      
                  </Select></pre>
<pre>Adhar_No:    <input type="text" name="Adhar_No" value=""size="20"></pre>
<pre>Pin_Code:    <input type="text" name="Pin_no"size="10"></pre>
<pre>Caste:       <input type="text" name="Caste" value=""size="10">              Religion: <input type="text" name="Religion" size="10"></pre>
<pre>Category:    <Select name="Catogory">
                  <option value="Catogory">Catogory</option>
                  <option value="Open">Open</option>
                  <option value="OBC">OBC</option>
                  <option value="Sc">SC</option>
                  <option value="NT">NT</option>
                  <option value="Other">Other</option>     </Select>
                  
                  
<pre>Annual_Income:<Select name="Annual_Income">
                    <option value="Annual_Income">Annual Income</option>
                    <option value="0 to 50000">0 to 50000</option>
                    <option value="50000 to 100000">50000 to 1Lakh</option> 
                    <option value="1Lakh to 2Lakh">1Lakh to 2Lakh</option> 
                    <option value="2Lakh to More">2Lakh to More</option>   </Select></pre>          
                

<pre>            <input type="submit"value="submit"/> <input type="reset" value="clear"/></pre>
                
</form>  

</body>
</html>