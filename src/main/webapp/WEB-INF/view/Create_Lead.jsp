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
<form action="savelead" method="post">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>
email<input type="text" name="email"/>
LeadSource:
<select name="leadSource">
<option  value="TV">TV</option>
<option  value="radio">radio</option>
<option  value="online">online</option>
<option  value="advertisment">Add</option>

</select>
mobile<input type="text" name="mobile"/>
<input type="submit" value="save"/>

</pre>

</form>

</body>
</html>