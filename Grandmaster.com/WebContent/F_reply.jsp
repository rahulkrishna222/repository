<%@page import="com.grandmaster.db.entity.Feedback"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<head>
<title>Feedback Reply</title>
<jsp:include page="dependencies.jsp" />
</head>
<body>
	<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>

		<div id="site_content">


			<div class="content">


				<div class="sidebar_center_l">
					<br />
					<table align="center">
						<tr>
							<td>
								<table>
									<tr>
										<td><h3 align="center" class="style19">Feedback Info</h3>

											<dl>
												<%
												    Feedback feedback = (Feedback) request.getAttribute("feedback");
																								    if (feedback == null) {
																								        String message = "Feedback Not Found";

																								        request.setAttribute("message", message);
																								        request.getRequestDispatcher("/error.jsp").forward(request, response);
																								    }
												%>
												<dt>&nbsp;</dt>
												<dd>
													<span>Email :</span><label title="lblEmail"><%=feedback.getEmail()%></label>
												</dd>
												<p>
												<dd>
													<span>Subject :</span><label title="lblSubject"><%=feedback.getSubject()%></label>
												</dd>
												<p>
												<dd>
													<span>Message :</span><label title="lblMessage" cols="30"
														rows="10"><%=feedback.getMessage()%></label>
												</dd>
											</dl></td>
									</tr>
								</table>
							</td>
							<td>
								<h3 align="center" class="style19">Reply Form</h3>
								<div align="center">
									<br />
									<form action="feedback_reply.html" method="post">
									<input type="hidden" name="txtFeedbackId" value="<%=feedback.getId() %>">
										<table align="center" style="color: #9966FF">
											<td>Subject</td>
											<td><input name="txtSubject" j type="text" id="email"
												value="RE:<%=feedback.getSubject()%> "></td>
											</tr>
											<tr>
												<td>Reply:</td>
												<td><textarea name="txtReplymessage" cols="30"
														rows="10" id="message"></textarea></td>
											</tr>
										</table>
									<input name="send" type="submit" id="send"
										value="         Send         " style="height: 37px">
									</form>
								</div>

							</td>
						</tr>
					</table>

				</div>
			</div>

		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
