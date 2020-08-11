<%--
  Created by IntelliJ IDEA.
  User: 13943
  Date: 2020/8/10
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/upload" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
      <input type="submit" value="upload2">
    </form>
  </body>
</html>
