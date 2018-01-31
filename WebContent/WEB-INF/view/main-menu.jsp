<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Main</title>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Assets Evaluator</h2>
		</div>
	</div>

				<p>
				Trying to print out months from database:
				<p>
				<!-- loop over and print our customers -->
				<c:forEach var="tempAsset" items="${assets}">
				
					<tr>
						<td><br> ${tempAsset.id} </td>
						<td><br> ${tempAsset.date} </td>
					</tr>
				
				</c:forEach>


</body>
</html>