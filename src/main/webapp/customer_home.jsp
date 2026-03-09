<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: #f4f6f9;
	margin: 40px;
}

.header {
	display: flex;
	justify-content: space-between;
	align-items: center;
	margin-bottom: 30px;
}

.container {
	display: flex;
	gap: 40px;
}

.profile {
	width: 30%;
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.bookings {
	width: 70%;
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 15px;
}

th {
	background: #34495e;
	color: white;
	padding: 12px;
	text-align: left;
}

td {
	padding: 12px;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background: #f2f2f2;
}

.status {
	padding: 5px 12px;
	border-radius: 20px;
	font-size: 12px;
	font-weight: bold;
	color: white;
}

.completed {
	background: #2ecc71;
}

.pending {
	background: #f39c12;
}

.cancelled {
	background: #e74c3c;
}

.logout-btn {
	padding: 8px 15px;
	background: #e74c3c;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="header">

		<h1>Welcome, Harika</h1>

		<button class="logout-btn">Logout</button>

	</div>

	<div class="container">

		<div class="profile">

			<h3>User Profile</h3>

			<p>
				<strong>Name:</strong> Harika
			</p>
			<p>
				<strong>Email:</strong> harika@gmail.com
			</p>
			<p>
				<strong>Phone:</strong> 9876543210
			</p>
			<p>
				<strong>City:</strong> Hyderabad
			</p>

		</div>

		<div class="bookings">

			<h3>Previous Bookings</h3>

			<table>

				<tr>
					<th>ID</th>
					<th>Date</th>
					<th>Driver</th>
					<th>Route</th>
					<th>Status</th>
				</tr>

				<tr>
					<td>101</td>
					<td>2026-03-01</td>
					<td>Ramesh</td>
					<td>Hyderabad → Bangalore</td>
					<td><span class="status completed">COMPLETED</span></td>
				</tr>

				<tr>
					<td>102</td>
					<td>2026-03-05</td>
					<td>Suresh</td>
					<td>Chennai → Hyderabad</td>
					<td><span class="status pending">PENDING</span></td>
				</tr>

				<tr>
					<td>103</td>
					<td>2026-03-08</td>
					<td>Mahesh</td>
					<td>Visakhapatnam → Vijayawada</td>
					<td><span class="status cancelled">CANCELLED</span></td>
				</tr>

			</table>

		</div>

	</div>

</body>
</html>


