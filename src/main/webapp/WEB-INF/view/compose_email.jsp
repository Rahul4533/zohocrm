<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
<h2>Compose email</h2>
<form action="sendemail" method="post">
<pre>
to<input type="text" value="${email}" name="to"/>
subject<input type="text" name="subject"/>
<textarea name="body" rows="8" cols="70"></textarea>
<input type="submit" value="send email"/>
</pre>
</form>

</body>
</html>