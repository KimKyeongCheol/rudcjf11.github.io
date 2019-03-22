<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 리스트</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="<%=application.getContextPath()%>" />
<c:set var="css" value="${path}/resources/css" />
<c:set var="js" value="${path}/resources/js" />
<c:set var="img" value="${path}/resources/image" />
<link rel="stylesheet" href="${css}/nBoard.css">
</head>
<body>
	<header id="header">
		<%@ include file="../../include/header.jsp"%>
	</header>

	<div id="container">
		<div id="wrap">
			<table class="table table-hover">
				<thead>
					<tr class="table-info">
						<th scope="col">No</th>
						<th scope="col">작성자</th>
						<th scope="col">제목</th>
						<th scope="col">작성일</th>
						<th scope="col">조회수</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">Info</th>
						<td>Column content</td>
						<td>Column content</td>
						<td>Column content</td>
						<td>Column content</td>
					</tr>
				</tbody>
				<tbody style="text-align: right;">
					<tr>
						<td colspan="5">
							<button class="btn btn-outline-danger" type="button">글쓰기</button>
						</td>
					</tr>
				</tbody>
				<tbody id="page">
					<tr>
						<td colspan="5">
							<div>
								<ul class="pagination">
									<li class="page-item disabled"><a class="page-link"
										href="#">&laquo;</a></li>
									<li class="page-item active"><a class="page-link" href="#">1</a>
									</li>
									<li class="page-item"><a class="page-link" href="#">2</a></li>
									<li class="page-item"><a class="page-link" href="#">3</a></li>
									<li class="page-item"><a class="page-link" href="#">4</a></li>
									<li class="page-item"><a class="page-link" href="#">5</a></li>
									<li class="page-item"><a class="page-link" href="#">&raquo;</a>
									</li>
								</ul>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>







	</div>

	<footer id="footer">
		<%@ include file="../../include/footer.jsp"%>
	</footer>
</body>
</html>