<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 蒋家聪
  Date: 2018/9/26
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="uploadImg.action" method="post" enctype="multipart/form-data">
    <c:if test="${image!=null}">
        <img src="/pic/${image}" width="100" height="100" /><br/>
    </c:if>
    <input type="file" name="file" /><br/>
    <input type="submit" value="上传" />
</form>
</body>
</html>
