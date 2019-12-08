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
	<jsp:include page="../main/header.jsp"></jsp:include>


	<div class="wrap">

		<div class="wrap_content" style="width: 80%;">

			<div class="content_left">
				<form>
					<div style="margin: 0 auto;">

						<input type='checkbox' name='job' value='gong' />공연 <input
							type='checkbox' name='job' value='yy' />연극 <input
							type='checkbox' name='job' value='mu' />뮤지컬 <input
							type='checkbox' name='job' value='tt' />등등 <input
							type='checkbox' name='job' value='and' />and select로
					</div>
					<div class="cus_left">
						<H1>공연사 정보 입력</H1>
						<br> <input type="file"> &nbsp;&nbsp;<input
							type="text"><br> <input type="file">&nbsp;&nbsp;<input
							type="text"> <br> <input type="text"
							placeholder="사업자 번호 = ID "> <input type="submit">

					</div>



				</form>
			</div>


			<div class="content_right"></div>




		</div>




	</div>





</body>
</html>