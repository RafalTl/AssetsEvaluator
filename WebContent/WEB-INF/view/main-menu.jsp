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

			<table>
				<tr>
					<th>ID</th>
					<th>Date</th>
					<th>Asset Name</th>
					<th>Amount</th>
					<th>Currency</th>
					<th>Asset Description</th>
					<th>User ID</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempAsset" items="${assets}">
				
					<tr>
						<td> ${tempAsset.id} </td>
						<td> ${tempAsset.date} </td>
						<td> ${tempAsset.asset_name} </td>
						<td> ${tempAsset.amount} </td>
						<td> ${tempAsset.currency} </td>
						<td> ${tempAsset.asset_description} </td>
						<td> ${tempAsset.user_id} </td>
					</tr>
				
				</c:forEach>
			</table>

</body>
</html>