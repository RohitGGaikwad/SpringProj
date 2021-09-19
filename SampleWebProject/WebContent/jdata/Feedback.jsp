<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback</title>
<script>
function checkInput(){
	
	var nameUsingId=document.getElementById("First_Name").value;
	if(nameUsingId==""){
		alert("Enter your First_Name");
		return false;
	}
	
	var nameUsingId=document.getElementById("Stud_Name").value;
	if(nameUsingId==""){
		alert("Enter your Stud_Name");
		return false;
	}
		
		var CommentUsingId=document.getElementById("Comment").value;
		if(CommentUsingId==""){
			alert("Enter Valid Comment");
			return false;
			}
		
		var campusUsingId=document.getElementById("campus").checked;
		/* alert(CommentUsingId); */
		if(campusUsingId==false){
			alert("Mention Your Opi Reg Our Campus");
			return false;
			}
		return true;
}
</script>
</head>
<body>
<h1><center><font colour="Black">Parent Feedback Form</center></font></h1>
<form action="/SampleWebProject/Feedback">
<pre> Name Of Parent:  <input type="text" name="First_Name"id="First_Name"><br></pre>
<pre> Name Of Student: <input type="text" name="Stud_Name" id="Stud_Name"><br></pre>
<b>Please give us Your Opinion about the following(please Fill whichever is Applicable Yes or No)</b>

<pre><table border="1"cellspacing="1"cellpading="20"></pre>

<tr>
<b><th>Area</th></b>
<th>Excellent</th>
<th>Good</th>
<th>Well</th>
<th>Bad</th>
</tr>
<tr>
<td>Our Campus</td>
<td><input type="radio" name="campus"  id="campus" value="Excellent"></td>
<td><input type="radio" name="campus"   id="campus" value="Good"></td>
<td><input type="radio" name="campus"   id="campus" value="Well"></td>
<td><input type="radio" name="campus"   id="campus" value="Bad"></td>
</tr>
<tr>
<td>Dicipline</td>
<td><input type="radio" name="Dicipline" value="Excellent"></td>
<td><input type="radio" name="Dicipline" value="Good"></td>
<td><input type="radio" name="Dicipline" value="Well"></td>
<td><input type="radio" name="Dicipline" value="Bad"></td>
</tr>
<tr>
<td>Extra Activity</td>
<td><input type="radio" name="Activity" value="Excellent"></td>
<td><input type="radio" name="Activity" value="Good"></td>
<td><input type="radio" name="Activity" value="Well"></td>
<td><input type="radio" name="Activity" value="Bad"></td>
</tr>

</table>

<b>Suggestion for further Improvement:</b>
          
                                         <textarea name="Comment"id="Comment"rows="8" cols="80"></textarea>
                                  <input type="submit"value="submit"onclick="return checkInput();"/> <input type="reset" value="clear"/></pre>
                                  </form>
</body>
</html>