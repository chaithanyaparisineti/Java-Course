<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<html>
<body>

<h2>Multiplication Table</h2>

<form method="post">
    Enter number:
    <input type="number" name="num" required>
    <input type="submit" value="Generate">
</form>
<%
    String number = request.getParameter("num");

    if (number != null) {
        int n = Integer.parseInt(number);
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            if (result % 10 == 0) {
                out.println(n + " x " + i + " = " + result + "<br>");
            }
        }
    }
%>
</body>
</html>
