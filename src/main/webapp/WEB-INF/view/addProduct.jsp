<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <form method = "POST" name = "add" >
        <h2>Adding new product</h2>
        <table border=1 cellpadding = 3 cellspacing = 0>
            <tr>
              <th>Try guess Id </th>
              <th>Name</th>
              <th>Price</th>
              <th>Sale</th>
              <th>About</th>
            </tr>
            <tr>
            <td>  <textarea name="id"></textarea>   </td>
            <td>  <textarea name="name"></textarea>  </td>
            <td>  <textarea name="price"></textarea>  </td>
            <td>  <textarea name="sale"></textarea>  </td>
            <td>  <textarea name="about"></textarea>  </td>
            </tr>

            <div>
            <p> <input type="submit" </p>
            </div>

</form>
</body>
</html>


