<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Noto+Sans+KR:wght@300;700&family=Quicksand:wght@600&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="/resources/css/board.css">
    <title>myBoard</title>
</head>
<body>
<div>
    <p class="board-title">게시판</p>
</div>
<div id="table-container">
    <table>
        <c:forEach items="${list}" var="bd">
        <tr>
            <td rowspan="2"><a class="idx">${bd.id}</a></td>
            <td rowspan="2" class="sp"><a href=""></a></td>
            <td class="title"><a href="/board/detail?id=${bd.id}">${bd.title}</a></td>
            <td><a>🐣${bd.writer}</a><br> <a>${bd.created_at}</a></td>
        </tr>
        <tr class="sm">
            </c:forEach>
    </table>
</div>
<div class="btn">
    <a href="/board/write">글쓰기</a>
</div>
</body>
</body>
</html>