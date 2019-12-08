<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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


	<!-- 관리자는 all / 사용자는 자주묻는질문글의 본인글에  삭제 수정 추가 만 가능.  -->
	<div class="serch_bar">
		<ul>
			<li><button>삭제</button></li>
			<li><button>수정</button></li>
			<li><button>추가</button></li>
			<li><input type="text"></li>
			<li><select>
					<option>공지사항</option>
					<option>자주묻는 질문</option>
					<option>관리자</option>
					<option>날자</option>
			</select></li>
			<li>검색</li>
		</ul>
	</div>

	<div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">체크박스</th>
					<th scope="col">No</th>
					<th scope="col">제목</th>
					<th scope="col">등록일</th>
					<th scope="col">???</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${NF_list }" var="NF_list">
					<tr class="table-primary">
						<th scope="col"><input type="checkbox"></th>
						<th scope="row">${NF_list.num }</th>
						<td>${NF_list.title }</td>
						<td>${NF_list.date }</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
								value="${NF_list.type }" /></td>
					</tr>


				</c:forEach>


			</tbody>
		</table>
	</div>


</body>
</html>