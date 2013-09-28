
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<head>
<title>Password Recovery</title>
<jsp:include page="dependencies.jsp" />
</head>
<body>
	<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>

		<div id="site_content">
			<div id="sidebar_container">
				<br />
				<div class="sidebar">
					<br />

					<h3 align="center">
						<strong>Recover Your Password</strong>
					</h3>
					<form action="resetPassword.html" method="post">

						
						<div align="center">
						<label> <span class="style16">Username :</span>
						</label>
							<input name="txtUsername" type="text" id="username"> <br />
							<br />
						</div>
						
						<div align="center">
						<br />
							<input name="btnRecovery" type="submit" id="recovery"
								value="     Recover My Password     " style="height: 37px">
						</div>
						
					</form>
				</div>

			</div>
			<br />

			<jsp:include page="services.jsp" />
		</div>

	</div>
	<jsp:include page="footer.jsp" />
</body>