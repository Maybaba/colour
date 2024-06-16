<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>404 - 페이지를 찾을 수 없습니다</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f8ff;
            font-family: 'Arial', sans-serif;
            color: #333;
            text-align: center;
        }

        .container {
            padding: 2em;
            border-radius: 10px;
            background: #fff;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 2.5em;
            margin-bottom: 0.5em;
        }

        p {
            font-size: 1.2em;
            margin-bottom: 1.5em;
        }

        a {
            text-decoration: none;
            color: #fff;
            background: #ff6347;
            padding: 0.75em 1.5em;
            border-radius: 25px;
            font-size: 1.2em;
            transition: background 0.3s ease;
        }

        a:hover {
            background: #ff4500;
        }

        .error-image {
            width: 150px;
            height: 150px;
            margin-bottom: 1em;
            background: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 64 64"><defs><style>.cls-1{fill:#00c9ff;}.cls-2{fill:#92fe9d;}.cls-3{fill:url(#linear-gradient);}.cls-4{fill:#fff;}</style><linearGradient id="linear-gradient" x1="0.5" y1="1" x2="0.5" gradientUnits="objectBoundingBox"><stop offset="0" stop-color="#ff6a00"/><stop offset="1" stop-color="#ee0979"/></linearGradient></defs><circle class="cls-1" cx="32" cy="32" r="30"/><circle class="cls-2" cx="32" cy="32" r="24"/><circle class="cls-3" cx="32" cy="32" r="16"/><path class="cls-4" d="M32,20a1,1,0,0,0-1,1V31a1,1,0,0,0,2,0V21A1,1,0,0,0,32,20Z"/><circle class="cls-4" cx="32" cy="36" r="1.5"/></svg>') no-repeat center;
    background-size: contain;
    }
    </style>
</head>
<body>
<div class="container">
    <div class="error-image"></div>
    <h1>404! 페이지를 찾을 수 없습니다.</h1>
    <p>요청하신 페이지가 존재하지 않거나, 이동되었을 수 있습니다.</p>
    <a href="/">홈으로 돌아가기</a>
</div>
</body>
</html>
