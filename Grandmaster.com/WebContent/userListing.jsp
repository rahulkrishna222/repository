<%@page import="com.grandmaster.db.entity.UserProfile"%>
<%@page import="java.util.List"%>
<%@page import="com.grandmaster.db.entity.UserList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Users</title>
<jsp:include page="dependencies.jsp" />

<style type="text/css">
<!--
.style18 {
	color: #48678C
}

.style19 {
	color: #CC0000
}
-->
</style>

</head>
<body>
	<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>

		<div id="site_content">
			<div class="sidebar_center_l">
				<h3 align="center">
					<strong>User Details</strong>
				</h3>
				<p align="center" class="style19">&nbsp;</p>

				<div align="center">
					<table width="663" height="149" border="0" cellspacing="3px">
						<tr>
							<th style="background-color: #22003C" width="48" scope="col"><span
								class="style20">No.</span></th>
							<th style="background-color: #22003C" width="140" scope="col"><div
									align="center">
									<span class="style20">Email</span>
								</div></th>
							<th style="background-color: #22003C" width="96" scope="col"><div
									align="center">
									<span class="style20">Date of joining</span>
								</div></th>
							<th style="background-color: #22003C" width="81" scope="col"><div
									align="center">
									<span class="style20">Status</span>
								</div></th>
							<th style="background-color: #22003C" width="65" scope="col">&nbsp;</th>
							<th style="background-color: #22003C" width="65" scope="col">&nbsp;</th>

						</tr>
						<%
						    if (request.getSession(false) == null || request.getSession(false).getAttribute("userId") == null) {
						        request.setAttribute("message", "Your session expired, please login again");
						        request.getRequestDispatcher("/error.jsp").forward(request, response);
						    }
						    UserList userList = request.getAttribute("userList") != null ? (UserList) request.getAttribute("userList") : null;

						    if (userList != null && userList.getUserProfileList() != null && !userList.getUserProfileList().isEmpty()) {
						        int i = 0;
						        for (UserProfile user : userList.getUserProfileList()) {
						            if (user != null) {
						%>
						<tr>
							<td style="background-color: #22003C"><%=++i%></td>
							<td style="background-color: #22003C"><%=user.getEmail()%></td>
							<td style="background-color: #22003C"><%=user.getCreationTime().toGMTString()%></td>
							<td style="background-color: #22003C"><a
								href="profile.html?id=<%=user.getUserId()%>">View</a></td>
							<td style="background-color: #22003C"><input type="submit"
								name="btnupdate" value=" Update "></td>
						</tr>
						<%
						    }
						        }
						    }
						%>

						<tr>
							<td style="background-color: #22003C" colspan="6">
								<div align="left">
									<a href="#">&lt;&lt;prev</a>
								</div>
							</td>

							<td style="background-color: #22003C"><div align="right">
									<a href="#">Next&gt;&gt;</a>
								</div></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<jsp:include page="footer.jsp" />
</body>
</html>