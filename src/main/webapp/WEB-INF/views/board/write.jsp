<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="/resources/css/write.css">
    <title>Document</title>
</head>
<body>
<div class="formform">
    <form action="/board/insert" method="post">
        <div id="write">
            <p>글쓰기</p>
        </div>
        <div>
            <label>제목 : </label><input type="text" id="title" name="title">
        </div>
        <div>
            <label>글쓴이 : </label><input type="text" id="writer" name="writer">
        </div>
        <div>
            <label>프로필 : </label><input type="text" id="profile" name="profile">
        </div>
        <div>
            <label>내용 : </label>
            <textarea name="content" id="content" rows="20" cols="50"></textarea>
        </div>
        <div class="button-container">
            <button type="reset">다시쓰기</button>
            <button type="submit">제출</button>
            <button type="button" onclick="history.back();">취소</button>
        </div>
    </form>
</div>
</body>
</html>