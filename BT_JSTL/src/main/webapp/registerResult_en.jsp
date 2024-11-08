<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Result</title>
</head>
<body>
    <h2>Registration Result</h2>
    <p>Username: ${requestScope.username}</p>
    <p>Email: ${requestScope.email}</p>
    <p>Phone: ${requestScope.phone}</p>

    <form action="RegisterServlet" method="get">
        <button type="submit" name="lang" value="vi">Tiếng Việt</button>
    </form>
</body>
</html>
