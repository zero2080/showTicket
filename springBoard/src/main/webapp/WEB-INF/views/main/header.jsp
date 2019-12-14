<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<c:if test="${empty member}">
	<jsp:forward page="goIndex.do"/>
</c:if>
	<div class="wrap">
		<div class="logo_size">

			<img src="">
		</div>
		<div class="logo_bottom">
		<c:if test="${member.acnt_type eq 0 }">
			<ul>
				<li>공연 등록수 : cnt.var</li>
				<li>앱 가입자수 : user_total.val</li>
			</ul>
		</c:if>
		</div>

		
		<div>
			<nav class="navbar navbar-expand-lg navbar-dark bg-primary">

				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarColor01" aria-controls="navbarColor01"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
		
				<div class="collapse navbar-collapse" id="navbarColor01">
				<c:if test="${member.acnt_type eq 0 }">
					<ul class="navbar-nav mr-auto" style="margin: 0 auto;">
						<li class="nav-item">
							<a class="nav-link" href="main.do">공연정보 업로드 <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="admin_insert.do">공연 계정 발급</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="notice_list.do">공지사항</a>
						</li>
						<!--Notice_Faq_List  -->
						<li class="nav-item">
							<a class="nav-link" href="faq_list.do">FAQ</a>
						</li>
					</ul>
				</c:if>
				
				<c:if test="${member.acnt_type eq 1 }">
					<ul class="navbar-nav mr-auto" style="margin: 0 auto;">
						<li class="nav-item ">
							<a class="nav-link" href="main.do">공연 목록 조회 <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="uploadShowInfo.do">공연 정보 업로드</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="reservation.do">좌석 현황 및 예약</a>
						</li>
						
					</ul>
				</c:if>
				
				
				</div>
			</nav>

		</div>




	</div>
</body>
</html>