<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h2>bill info</h2>
<table border="2">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Product</th>
<th>Mobile</th>
<th>Amount</th>
</tr>
<tr>
<td>${bill.id}</td>
<td>${bill.firstName}</td>
<td>${bill.lastName}</td>
<td>${bill.email}</td>
<td>${bill.productName}</td>
<td>${bill.mobile}</td>
<td>${bill.amount}</td>


</table>

<a href="Billing">Billing</a>

</body>
</html>