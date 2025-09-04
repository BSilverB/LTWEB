<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách danh mục</title>
</head>
<body>
    <table border="1" width="100%">
        <tr>
            <th>STT</th>
            <th>Hình ảnh</th>
            <th>Tên danh mục</th>
            <th>Hành động</th>
        </tr>
        <c:forEach items="${cateList}" var="cate" varStatus="STT">
            <tr>
                <td>${STT.index + 1}</td>
                <c:url value="/image?fname=${cate.icon}" var="imgUrl"/>
                <td><img height="150" width="200" src="${imgUrl}" /></td>
                <td>${cate.catename}</td>
                <td>
                    <a href="<c:url value='/admin/category/edit?id=${cate.cateid}'/>">Sửa</a> |
                    <a href="<c:url value='/admin/category/delete?id=${cate.cateid}'/>">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
