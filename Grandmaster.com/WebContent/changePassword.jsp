<%@page import="com.grandmaster.db.entity.UserProfile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Change Password</title>
<jsp:include page="dependencies.jsp" />

<style type="text/css">
<!--
.style345 {
	color: #FFF
}

.style21 {
	font-size: 24px;
	font-weight: bold;
}

.style22 {
	font-size: 36px;
	font-weight: bold;
}

.style23 {
	font-size: 18px
}
-->
</style>



<style type="text/css">
.tb {
	border: 1px solid #36F;
}

.custom_error {
	background-image: url(images/error.png);
	background-repeat: no-repeat;
	background-position: right;
}

.error_free {
	background-image: url(images/accept.png);
	background-repeat: no-repeat;
	background-position: right;
}
</style>

</head>
<body>
	<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>

		<div id="site_content">
			<div id="sidebar_container">
				<br />
				<% if (request.getAttribute("UUID") == null) { %>
				<div class="sidebar_profile">
					<br />
					<ul>
						<li>
							<h3>
								<a href="home.jsp"><strong>My Home</strong></a>
							</h3>
						</li>
						<li>
							<h3>
								<a href="profile.jsp"><strong>Profile</strong></a>
							</h3>
						</li>

						<li>
							<h3>
								<a href="history.jsp"><strong>My Games</strong></a>
							</h3>
						</li>

						<li>
							<h3>
								<a href="position.jsp"><strong>My Position</strong></a>
							</h3>
						</li>

						<li>
							<h3>
								<a href="scores.jsp"><strong>Highest Scores</strong></a>
							</h3>
						</li>
						<li>
							<h3>
								<a href="onlineUserList.html"><strong>New Game</strong></a>
							</h3>
						</li>
					</ul>

				</div>
			<% } %>
			</div>
			<div class="content">
				<p>
				<div class="sidebar_center_profile">
					<br />
					<h3 align="center">Change Your Password</h3>
					<p align="center">
					<form action="changePassword.html" method="post">
						<input type="hidden" name="txtUUID" value="<%=request.getAttribute("UUID")%>">

						<table width="550" height="149" border="0" cellspacing="3px">
							<tr>
								<td><label>Email id :</label></td>
								<td><input name="txtEmail" type="text" size="40" class="tb" /></td>

							</tr>
							<% if (request.getAttribute("UUID") == null ){ %>
							<tr>
								<td><label>Current Password :</label></td>
								<td><input name="txtCurrentPswd" type="password" size="40"
									class="tb" /></td>
							</tr>
							<% } %>
							<tr>
								<td><label>New Password :</label></td>
								<td><input name="txtNewPswd" type="password" size="40"
									class="tb" /></td>
							</tr>
							<tr>
								<td><label>Confirm Password :</label></td>
								<td><input name="txtConfPswd" type="password" size="40"
									class="tb" /></td>
							</tr>
							<tr>
								<td colspan="2"><div align="center">
										<input type="submit" name="btnSubmit"
											value="      Reset Password      " style="height: 37px" />
									</div></td>

							</tr>
						</table>
					</form>
				</div>

			</div>
		</div>

	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>