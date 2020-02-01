<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/4.4.1/bootstrap-4.4.1.jar!/META-INF/resources/webjars/bootstrap/4.4.1/css/bootstrap-grid.min.css"
	    		rel="stylesheet">

</head>

<body>
	<div class="container">
		<table class="table table-dark">
			<caption style="color:Dodgerblue"><h3>Your todos are</h3></caption>
			<thead class="thead-dark">
				<tr>
					<th>User</th>
					<th>Description</th>
					<th>Date</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.user}</td>
						<td> <a type="button" style="color:violet;" href="/update?count=${todo.count}">${todo.desc}</a></td>
						<td>${todo.date}</td>
						<td><a type="button" style="color:red;" href="/delete?count=${todo.count}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<div> <a class="button" href="/add-todo">Add a Todo</a></div>
			<script src="webjars/bootstrap/4.4.1/bootstrap-4.4.1.jar!/META-INF/resources/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
            	    <script src="webjars/bootstrap/4.4.1/bootstrap-4.4.1.jar!/META-INF/resources/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</div>
</body>

</html>