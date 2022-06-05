<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead result</title>
</head>
<body>
<a href="view">Create New Lead</a>
<h2>Lead List<br></h2>
<table>
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>LeadSource</th>
<th>Mobile</th>
<th>Generate Bill</th>
<th>Delete</th>
</tr>

<c:forEach items="${contacts}" var="contact">
<tr>
<td>${contact.id }</td>
<td><a href="getContactById?id=${contact.id }">${contact.firstName }</a></td>
<td>${contact.lastName}</td>
<td>${contact.email }</td>
<td>${contact.leadSource }</td>
<td>${contact.mobile }</td>
<td><a href="getContactById?id=${contact.id }">Generate Bill</a></td>
<td><a href="deleteContactById?id=${contact.id }">Delete</a></td>


</tr>



</c:forEach>

</table>
</body>
</html>