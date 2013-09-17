<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<head>
<title>Feedback</title>
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
										<td><h3 align="center" class="style19">Our Contact</h3>
											<figure>
												<iframe width="240" height="180"
													src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Marian+College+kuttikkanam,idukki,kerala,india&amp;aq=&amp;sll=11.490791,77.299805&amp;sspn=6.047869,10.821533&amp;ie=UTF8&amp;hq=&amp;hnear=&amp;ll=9.58352,76.971687&amp;spn=0.006295,0.006295&amp;t=m&amp;iwloc=A&amp;output=embed"></iframe>
											</figure>
											<dl>
												<dt>&nbsp;</dt>
												<dd>
													<span>Telephone:</span> +1 800 603 6035
												</dd>
												<dd>
													<span>Fax:</span> +1 800 889 9898
												</dd>
												<dd>
													<span>Email:</span><a class="color-2" href="#">sruthiits@gmail.com</a>
												</dd>
											</dl></td>
									</tr>
								</table>
							</td>
							<td>
								<h3 align="center" class="style19">Feedback Form</h3>
								<div align="center">
									<form action="feedback.do" method="post">
										<br />
										<table align="center" style="color: #9966FF">
											<tr>
												<td width="120px">Your Name:</td>
												<td width="350px"><input name="txtName" type="text"
													id="name"></td>
											</tr>
											<tr>
												<td>Your Email:</td>
												<td><input name="txtEmail" type="text" id="email"></td>
											</tr>
											<tr>
												<td>Subject:</td>
												<td><input name="txtSubject" type="text" id="email"></td>
											</tr>
											<tr>
												<td>Your Message:</td>
												<td><textarea name="txtMessage" cols="30" rows="10"
														id="message"></textarea></td>
											</tr>
										</table>
										<input name="btnSendFeedback" type="submit" id="send"
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
