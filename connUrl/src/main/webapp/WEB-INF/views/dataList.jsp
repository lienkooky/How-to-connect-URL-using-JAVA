<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>dataList</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script src="./js/data.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	</head>
	<body>
	
		<div class="container">
			<h4 style="text-align: center; padding: 50px 0">JSON Data List</h4>
			<table class="table table-striped" id="member_table">
				<thead>
					<tr>
						<th>No</th>
						<th>관할 경찰서</th>
						<th>다발지역 지점의 위치</th>
						<th>경상자수</th>
						<th>중상자수</th>
						<th>사망자수</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
		
	</body>
</html>



