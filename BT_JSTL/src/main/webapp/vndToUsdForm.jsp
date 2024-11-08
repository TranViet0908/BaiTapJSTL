<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chuyển đổi VNĐ sang USD</title>
</head>
<body>
    <h2>Chuyển đổi đơn vị tiền tệ từ VNĐ sang USD</h2>
    <form action="VNDToUSDServlet" method="post">
        <label for="vnd">Nhập số tiền VNĐ:</label>
        <input type="number" id="vnd" name="vnd" step="1" required>
        <button type="submit">Chuyển đổi</button>
    </form>
</body>
</html>
