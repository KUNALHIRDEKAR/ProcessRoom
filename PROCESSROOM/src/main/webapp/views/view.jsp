<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>Sr.</th>
				<th>demoID</th>
				<th>noteDenomination</th>
				<th>denoFlag</th>
				<th>denoSeries</th>
				<th>Update</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${denoList}" var="user" varStatus="myIndex">
				<tr>
					<td>${myIndex.index +1}</td>
					<td>${user.demoID}</td>
					<td>${user.noteDenomination}</td>
					<td>${user.denoFlag}</td>
					<td>${user.denoSeries}</td>
					<td><a href="editUser?uid="><i class='fas fa-edit'
							style='color: red'><span class="tooltiptext">Edit</span></i></a>
						&nbsp;&nbsp; <a href="deleteUser?uid="
						onclick="return confirm('Are you sure to Delete?')"><i
							class='fas fa-trash-alt'><span class="tooltiptext">Delete</span></i></a></td>
				</tr>
			</c:forEach>

		</tbody>


	</table>
</body>
</html>