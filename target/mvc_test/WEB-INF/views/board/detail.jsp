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
    <script src="https://code.jquery.com/jquery-3.7.1.js"
            integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Noto+Sans+KR:wght@300;700&family=Quicksand:wght@600&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="/resources/css/detail.css">
    <title>myDetail</title>
</head>
<body>
<div class="detail">
    <p>상세</p>
</div>
<div class="contentD">
    <p>${detail.title}</p>
    <br>
    <p>🐣${detail.writer}</p>
    <p>${detail.created_at}</p>
    <br>
    <img src="${detail.profile}">
    <p id="content">${detail.content}</p>
</div>
<div class="btn">
    <a href='/board/delete?id=${detail.id}'>삭제</a>
</div>
<div class="replyWrite">
    <label>글쓴이 : </label>
    <input type="text" id="rwriter">
    <label>내용 : </label>
    <textarea id="rcontent" rows="20" cols="50"></textarea>
    <button id="replybtn" onclick="writerReply()">댓글 달기</button>
</div>
<div class="detail">
    <p>A.</p>
</div>
<div class="reply">
    <p>1</p><br>
    <p>
        취직을 원하시면 현재 70%이상 JAVA & SPRING & JSP 인 프로젝트들이 많아요~~ 공부하시고 취업하시는데
        문제 없으시고 미래를 보신다면 대학원 가시거나 JAVA 마스터하시고 1~5위 유망 언어 GO, 코틀린, 파이썬 추천 드립니다.
        앞으로 대기업 취업 좋아요
    </p><br>
    <p>2023.05.23</p>
</div>
</body>
<script>
    function writerReply() {
        var writer = document.getElementById("rwriter").value;
        var content = document.getElementById("rcontent").value;
        var board = '${detail.id}';
        $.ajax({
            type: "post"
            , url: "/reply/save"
            , data: {
                rwriter: writer  //dto: var
                , rcontent: content
                , cid: board
            }
            , dataType: "json"
            , success: function (replyList) {
                console.log("성공");
            }
            , error: function () {
                console.log("에러");
            }
        });
    }
</script>
</html>