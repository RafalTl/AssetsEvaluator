<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Asset</title>
</head>
<body>
	<h3>Save Asset:</h3>

	<form:form action="saveAsset" modelAttribute="asset" method="POST">
			
		<form:hidden path="id" />
			
			<table>
				<tbody>

					<tr>
						<td><label>Date:</label></td>
						<td><form:input path="date" type="date" /></td>
					</tr>
					<tr>
						<td><label>Asset Name:</label></td>
						<td><form:input path="asset_name" /></td>
					</tr>	
					<tr>
						<td><label>Amount:</label></td>
						<td><form:input path="amount" /></td>
					</tr>
					<tr>
						<td><label>Currency:</label></td>
						<td><form:input path="currency" /></td>
					</tr>
					<tr>
						<td><label>Asset Description:</label></td>
						<td><form:input path="asset_description" /></td>
					</tr>		
					<tr>
						<td><label>User ID:</label></td>
						<td><form:input path="user_id" /></td>
					</tr>													
					<tr>
						<td><label></label></td>
						<td>
							<input type="submit" value="Save" class="save"/>
							<a href="${pageContext.request.contextPath}/">Cancel</a>
						</td>
					</tr>					
					
														
				</tbody>
			</table>
		
		</form:form>



</body>
</html>