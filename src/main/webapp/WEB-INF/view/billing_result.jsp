<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill result</title>
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
<th>ProductName</th>
<th>Mobile</th>
<th>Amount</th>


</tr>

<c:forEach items="${bills}" var="bill">
<tr>
<td>${bill.id }</td>
<td>${bill.firstName}</td>
<td>${bill.lastName}</td>
<td>${bill.email }</td>
<td>${bill.productName }</td>
<td>${bill.mobile }</td>
<td>${bill.amount }</td>



</tr>



</c:forEach>

</table>
</body>
</html>