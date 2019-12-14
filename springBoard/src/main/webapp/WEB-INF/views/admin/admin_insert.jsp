<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="conPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${conPath }/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function(){
		//가입 ajax로 전환, form유효성 검사 javascript로 구현
	});
</script>

<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../main/header.jsp"></jsp:include>

	<div class="wrap">

		<div class="wrap_content" style="width: 80%;">

			<div class="content_left">
				<form method="post" action="${conPath }/admin_join.do" enctype="multipart/form-data">
					<div class="cus_left">
						<H1>공연사 정보 입력</H1>
							<br>
							<c:if test="${idExist}">
								<h2>이미 존재하는 아이디(사업자 등록번호) 입니다.</h2>
							</c:if>
							<br>
						<input type="file" name="biz_reg"> &nbsp;&nbsp;
						<input type="text" name="acnt_id" placeholder="사업자 번호 = ID ">
							<br>
						<input type="file" name="bank_book">&nbsp;&nbsp;
						<input type="text" name="bank" placeholder="은행">
							<br>
						<input type="text" name="name" placeholder="이름"> 
						<input type="password" name="acnt_pw" placeholder="비밀번호">
						<input type="submit">
					</div>
				</form>
			</div>
			<div class="content_right">
				<!-- https://dongyeopblog.wordpress.com/2017/09/02/javascript-%EC%9D%B4%EB%AF%B8%EC%A7%80-%EB%AF%B8%EB%A6%AC%EB%B3%B4%EC%97%AC%EC%A3%BC%EA%B8%B0-preview-image-upload/ -->

				<!--  이미지 파일 업로드시 미리보기 가 나오면 어떨까?  +_+  기간 여유있으면..-->
				<div>
					이미지 업로드시 미리보기 ex )
					사업자 등록증 + 통장사본 까지 나오고 클릭시 확대  까지 . 
					고민중.
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>