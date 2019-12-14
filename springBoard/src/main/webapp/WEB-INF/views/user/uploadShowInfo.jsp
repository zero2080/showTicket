<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="conPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${conPath }/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../main/header.jsp"/>
	<h1>공연을 등록한다!!</h1>
	<div style="width:80%; border:1px solid white; margin:0 auto;">
		<form method="post" action="${conPath }/uploadShow.do" enctype="multipart/form-data">
			<select name="category1">
				<option value="0">공연</option>
				<option value="1">농원</option>
				<option value="2">밴드</option>
			</select>
			<select name="category2">
				<option value="0">뮤지컬</option>
				<option value="1">공연</option>
				<option value="2">넌버벌</option>
				<option value="3">찾아가는</option>
			</select>
			<input type="file" name="detImg" /><br>
			<input type="file" name="subImg"/><br>
			<input type="file" name="mainImg"/><br>
			<input type="text" name="acnt_id" value="${member.acnt_id }" disabled/>
			<input type="text" name="name" value="${member.name }" disabled/>
			<input type="text" name="company" required="required"/>
			<input type="text" name="ticket_name" required="required"/>
			<input type="number" name="show_mini" required="required"/>
			<input type="number" name="ticket_price" required="required"/>
			<input type="number" name="show_time" required="required"/>
			<input type="text" name="address" required="required"/>
			<input type="number" name="day_ticket" required="required"/>
			<input type="text" name="show_start_time" required="required"/>
			<input type="datetime-local" name="create_date" required="required"/>
			<input type="date" name="open_date" required="required"/>
			<input type="date" name="del_date" required="required"/>
			<input type="file" name="doc" required="required"/>
			<input type="submit" value="등록">
		</form>
	</div>
</body>
</html>