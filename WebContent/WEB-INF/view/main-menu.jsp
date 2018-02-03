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
	
		<input type="button" value="Add asset" 
				onclick="window.location.href='showAddAssetForm'; return false;"
				class="add-button"
		/>
	

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
					<c:param name="assetId" value="${tempAsset.id}"/>
				</c:url>				
				
				<c:url var="deleteLink" value="/delete">
					<c:param name="assetId" value="${tempAsset.id}"/>
				</c:url>
				
					<tr>
						<td> ${tempAsset.id} </td>
						<td> ${tempAsset.date} </td>
						<td> ${tempAsset.asset_name} </td>
						<td> ${tempAsset.amount} </td>
						<td> ${tempAsset.currency} </td>
						<td> ${tempAsset.asset_description} </td>
						<td> ${tempAsset.user_id} </td>
						<td> 
							<a href="${updateLink}">Update</a> 
							| 
							<a href="${deleteLink}" 
							onclick="if (!(confirm('Are you sure? Delete chosen asset?'))) return false">Delete</a>
						</td>
					</tr>
				
				</c:forEach>
			</table>

</body>
</html>