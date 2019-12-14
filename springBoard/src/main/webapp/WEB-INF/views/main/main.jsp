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
	<jsp:include page="header.jsp"></jsp:include>
<div> 
	<c:if test="${member.acnt_type eq 0 }">
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">No</th>
					<th scope="col">공연 명 </th>
					<th scope="col">회사명</th>
					<th scope="col">Date</th>
				</tr>
			</thead>
			
			<tbody>
				<tr class="table-primary">
					<th scope="row">No.val</th>
					<td>Titel.val</td>
					<td>회사.val </td>
					<td>Date.val</td>
				</tr>
	
			</tbody>
		</table>
	</c:if>
	<c:if test="${member.acnt_type eq 1 }">
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">등록 공연 리스트</th>
				</tr>
			</thead>
			<tbody>
				<!-- 이건 테스트 줄이니 삭제해도됨 -->
				<tr  class="table-primary">
					<td scope="row">공연목록이뜬다~~</td>
				</tr>
				<tr  class="table-primary">
					<td scope="row">공연목록이뜬다~~</td>
				</tr>
				
				
			<!-- 
				<c:forEach var ="i" items="공연리스트 ">
					<tr>
						<td>공연리스트.공연번호</td>
						<td>공연리스트.공연이름</td>
					</tr>
				</c:forEach>
			 --> 
			</tbody>
		</table>
	</c:if>
</div>


</body>
</html>