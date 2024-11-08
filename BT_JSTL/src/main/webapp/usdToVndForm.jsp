<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chuyển đổi USD sang VNĐ</title>
</head>
<body>
    <h2>Chuyển đổi đơn vị tiền tệ từ USD sang VNĐ</h2>
    <form action="USDToVNDServlet" method="post">
        <label for="usd">Nhập số tiền USD:</label>
        <input type="number" id="usd" name="usd" step="0.01" required>
        <button type="submit">Chuyển đổi</button>
    </form>
</body>
</html>
