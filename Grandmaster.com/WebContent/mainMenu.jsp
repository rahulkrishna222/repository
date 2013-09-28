<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div id="logo">
	<div id="logo_text">
		<!-- class="logo_colour", allows you to change the colour of the text -->
		<h1 style="font: 640% 'Jenna Sue', arial, sans-serif">
			<a href="index.jsp"><span class="style2">GrandMaster</span><span
				class="logo_colour">.com</span></a>
		</h1>
		<h2 style="font: 440% 'Jenna Sue', arial, sans-serif" align="center">
			"Every Chess master was once a beginner" <span class="style2">(Chernev).</span>
		</h2>
	</div>
</div>
<nav>
<div id="menu_container">
	<ul class="sf-menu" id="nav">
		<li><a href="index.jsp">Home</a></li>
		<li><a href="onlineUserList.html">Play</a></li>
		<li><a href="rules.jsp">Game Rules</a></li>
		<li><a href="about.jsp">About Chess</a></li>
		<li><a href="gallery.jsp">Gallery</a></li>
		<li><a href="feedback.jsp">Contact Us</a></li>
		<%
		    if (request.getSession(false) != null && request.getSession(false).getAttribute("userId") != null) {
		%>
		<li><a href="logOut.html">Sign out</a></li>
		<%
		    } else {
		%>
		<li><a href="registration.jsp">Sign up</a></li>
		<%
		    }
		%>


	</ul>
</div>
</nav>

