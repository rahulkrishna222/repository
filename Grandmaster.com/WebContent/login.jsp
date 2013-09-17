<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<head>
<title>Sign In</title>
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
						<strong>Sign In</strong>
					</h3>
					<form action="login.do" method="Post">

						<label> <span class="style16">Username</span>
						</label>
						<div align="center">
							<input name="txtUsername" type="text" id="username"> <br />
							<br />
						</div>
						<label> <span class="style16">Password</span>
						</label>
						<div align="center">
							<input name="txtPassword" type="password" id="password">
							<br /> <br /> <br />
						</div>
						<div align="center">
							<input name="btnLogin" type="submit" id="sign_in"
								value="     Sign In     " style="height: 37px">
						</div>
						<div align="center">
							<%
							    if (request.getAttribute("loginErrorMessage") != null) {
							%>
							<br /> <span class="style17"><%=request.getAttribute("loginErrorMessage")%>
							</span>
							<%
							    }
							%>
							<br /> <a href="#"><span class="style17">Can't access
									your account ?</span> </a>
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