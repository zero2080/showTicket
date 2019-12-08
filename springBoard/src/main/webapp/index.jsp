<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="conPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${conPath }/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>

	<div class="wrap">


		<div class="logo">

			<div>
				<a href="home.do" style="font-size: 3em;">가즈아!!</a><br> <a
					href="${conPath }/main.do"> 어드민 메인으로 가기 . </a><br> <a
					href="${conPath }/admin_insert.do"> 관리자등록 . </a><br> <a
					href="${conPath }/admin_modify.do"> 관리자 정보수정 . </a><br> <a
					href="${conPath }/notice_list.do"> 공지사항 ㄱ 0 / 1로 구분 . </a> <br>


				<div id="img_center">
					<img src="">
				</div>
			</div>
		</div>

		<div class="main_content">
			<form method="post" id="authForm" action="${conPath }/loginPro.do">
				<div>
					<label for="loginId"></label> 
					<input type="text" id="loginId" name="loginId" placeholder="공연사">
						<br>
						<br>
					<label for="loginPw"></label> 
					<input type="password" id="loginPw" name="loginPw" placeholder="Password">
				</div>
				<input type="submit" value="로그인" />
				<div id="text_right">
					<input type="checkbox" id="keepLogin" name="keepLogin"> 
					<label for="keepLogin">
						<span>로그인 상태 유지</span>
					</label>
				</div>
			</form>

		</div>


	</div>










</body>
</html>