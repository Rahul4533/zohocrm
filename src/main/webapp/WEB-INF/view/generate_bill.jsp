<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create | Lead</h2>
<form action="generate" method="post">
<pre>
First Name<input type="text" name="firstName" value="${contact.firstName }"/>
Last Name<input type="text" name="lastName" value="${contact.lastName }"/>
email<input type="text" name="email" value="${contact.email }"/>

mobile<input type="text" name="mobile" value="${contact.mobile }"/>
ProductName<input type="text" name="productName"/>
Amount<input type="text" name="amount"/>
<input type="submit" value="generate"/>

</pre>

</form>

</body>
</html>