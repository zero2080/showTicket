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
<script src="${conPath }/js/uploadShowInfo.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../main/header.jsp"></jsp:include>
	<h1>공연을 등록한다!!</h1>
	<form method="post" action="${conPath }/uploadShow.do">
		<table>
				<tr>
					<td>
						<div>
							<input type="button" name="addimg_0" value="+" style="width:300px;height:80px; font-size:3em;" onclick="addImg_1()"/>
						</div>
					</td>
					<td>
						<div>
							<input type="file" name="show_img_0" id="showImg_0" style="display:none;"/>
							<label for="showImg_0">이미지<br>업로드</label>
						</div>
					</td>
				</tr>
				<tr id="addimg_1" style="display:none">
					<td>
						<div>
							<input type="button" name="addimg_1" value="+" style="width:300px;height:80px; font-size:3em;" onclick="addImg_2()"/>
						</div>
					</td>
					<td>
						<div>
							<input type="file" name="show_img_1" id="showImg_1" style="display:none;">
							<label for="showImg_1">이미지<br>업로드</label>
						</div>
					</td>
				</tr>
				<tr id="addimg_2" style="display:none">
					<td>
						<div>
							<input type="button" name="addimg_2" value="+" style="width:300px;height:80px; font-size:3em;" onclick="addImg_3()"/>
						</div>
					</td>
					<td>
						<div>
							<input type="file" name="show_img_2" id="showImg_2" style="display:none;"/>
							<label for="showImg_2">이미지<br>업로드</label>
						</div>
					</td>
				</tr>
				<tr id="addimg_3" style="display:none">
					<td>
						<div>
							<input type="button" name="addimg_3" value="+" style="width:300px;height:80px; font-size:3em;" onclick="addImg_4()"/>
						</div>
					</td>
					<td>
						<div>
							<input type="file" name="show_img_3" id="showImg_3" style="display:none;"/>
							<label for="showImg_3">이미지<br>업로드</label>
						</div>
					</td>
				</tr>
				<tr id="addimg_4" style="display:none">
					<td>
						<div>
							<input type="button" name="addimg_4" value="+" style="width:300px;height:80px; font-size:3em;" disabled="disabled"/>
						</div>
					</td>
					<td>
						<div>
							<input type="file" name="show_img_4" id="showImg_4" style="display:none;"/>
							<label for="showImg_1">이미지<br>업로드</label>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<textarea style="width:500px;height:100px;" name="mainContent"></textarea>
					</td>
				</tr>
		</table>
	</form>
</body>
</html>