
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <h2>My Shop</h2>
        <table border=1 cellpadding=3 cellspacing=0>
            <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Price</th>
              <th>Sale</th>
              <th>About</th>
            </tr>
        <c:forEach items="${products}" var="item">
        <tr>
            <td> ${item.id}</td>
            <td> ${item.name}</td>
            <td> ${item.price}</td>
            <td> ${item.sale}</td>
            <td> ${item.about}</td>
            </tr>
        </c:forEach>
<form method = "GET" name = "add" action = "${pageContext.request.contextPath}/add">
<p> <input type="submit" name="submit_btn" value="Add new products"> </p>
</form>

</body>
</html>
