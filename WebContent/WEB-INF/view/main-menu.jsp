<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
	<title>Main</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
							integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Assets Evaluator</h2>
		</div>
	</div>

	<input type="button" value="Add asset"
		onclick="window.location.href='showAddAssetForm'; return false;"
		class="add-button" />

	<hr>

	<c:forEach var="tempSortedDate" items="${sortedDates}">
		<c:url var="sortLink" value="/">
			<c:param name="chosenDate" value="${tempSortedDate}" />
		</c:url>
		<li><a href="${sortLink}">Sort by: ${tempSortedDate}</a></li>
	</c:forEach>

	<hr>

	<table>
		<tr>
			<th>ID</th>
			<th>Date</th>
			<th>Asset Name</th>
			<th>Amount</th>
			<th>Currency</th>
			<th>Asset Description</th>
			<th>User ID</th>
			<th>Action</th>
		</tr>
		<!-- loop over and print assets -->
		<c:forEach var="tempAsset" items="${assets}">

			<c:url var="updateLink" value="/showUpdateForm">
				<c:param name="assetId" value="${tempAsset.id}" />
			</c:url>

			<c:url var="deleteLink" value="/delete">
				<c:param name="assetId" value="${tempAsset.id}" />
			</c:url>

			<tr>
				<td>${tempAsset.id}</td>
				<td>${tempAsset.date}</td>
				<td>${tempAsset.asset_name}</td>
				<td>${tempAsset.amount}</td>
				<td>${tempAsset.currency}</td>
				<td>${tempAsset.asset_description}</td>
				<td>${tempAsset.user_id}</td>
				<td><a href="${updateLink}">Update</a> | <a
					href="${deleteLink}"
					onclick="if (!(confirm('Are you sure? Delete chosen asset?'))) return false">Delete</a>
				</td>
			</tr>

		</c:forEach>
	</table>



</body>
</html>