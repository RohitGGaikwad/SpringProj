<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"
    import="Models.Personalform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
from ShowData Page...
<%ArrayList<Personalform> perList=(ArrayList)session.getAttribute("perList");
%>
 
<table border="1">
<tr>
<td>First_Name</td>
<td>Middle_Name</td>
<td>Last_Name</td>
<td>Mother_Name</td>
<td>P_Address</td>
<td>Mob_No</td>
<td>Tel_No</td>
<td>Gender</td>
<td>City</td>
<td>Tal</td>
<td>Dist</td>
<td>Pin_no</td>
<td>Adhar_No</td>
<td>Caste</td>
<td>Religion</td>
<td>Catogory</td>
<td>Annual_Income</td>
</tr>
<% for(Personalform per:perList){
	//out.println(bio.getInstrument_Name());
	//out.println(bio.getDate_of_record());
	//out.println(bio.getNo_of_Unit());
	//out.println(bio.getPrice_per_Unit());
	//out.println(bio.getLoad_unload());
%>
<tr>
<td><%=per.getFirst_Name()%></td>
<td><%=per.getMiddle_Name()%></td>
<td><%=per.getLast_Name()%></td>
<td><%=per.getMother_Name()%></td>
<td><%=per.getP_Address()%></td>
<td><%=per.getMob_No()%></td>
<td><%=per.getTel_No()%></td>
<td><%=per.getGender()%></td>
<td><%=per.getCity()%></td>
<td><%=per.getTal()%></td>
<td><%=per.getDist()%></td>
<td><%=per.getAdhar_No()%></td>
<td><%=per.getPin_no()%></td>
<td><%=per.getCaste()%></td>
<td><%=per.getReligion()%></td>
<td><%=per.getCatogory()%></td>
<td><%=per.getAnnual_Income()%></td>
</tr>
<%  } 
 %>
</table>
</body>
</html>