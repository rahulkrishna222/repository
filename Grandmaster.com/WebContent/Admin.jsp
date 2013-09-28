<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Administration</title>
<jsp:include page="dependencies_uh.jsp" />

<style type="text/css">
<!--
.style345{color: #FFF}
.style21 {
	font-size: 24px;
	font-weight: bold;
}
.style22 {
	font-size: 36px;
	font-weight: bold;
}
.style23 {font-size: 18px}



-->
</style>

</head>
<body>
<div id="main">
		<header>
			<jsp:include page="user_mainMenu.jsp" />
		<div>
		<br />
		<br />
		<br />
		<br />
		<br />
		<jsp:include page="slider.jsp" />
		</div>
		</header>
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />

		<div id="site_content">
		        <div id="sidebar_container">
	  <br />
	    <div class="sidebar_profile"> 
		<br />
          <ul>
           <li> <h3><a href="profile.html?id=<%=request.getSession().getAttribute("userId") %>" ><strong>Profile</strong></a> </h3>
            </li>
             <li> <h3><a href="feedback_list.html?all=true&start=0&count=20" ><strong>View Feedbacks</strong></a> </h3>
            </li>
            
            <li> <h3><a href="userListing.html?all=true" ><strong>List All Users</strong></a> </h3>
            </li>
            </ul>
            </div>
            
            <div class="sidebar_profile"> 
		     <br />
		     <ul>
		     <li> <h3><a href="change_rules.jsp" ><strong>Change Gaming Rules</strong></a> </h3>
            </li>
            <li> <h3><a href="change_aboutChess.jsp" ><strong>Change Chess Details</strong></a> </h3>
            </li>
      
            <li> <h3><a href="change_services.jsp" ><strong>Change Services</strong></a> </h3>
            </li>
            <li> <h3><a href="change_chessBoard.jsp" ><strong>Change Chess Board</strong></a> </h3>
            </li>
            <li> <h3><a href="change_contactAddress.jsp" ><strong>Change Contact Details</strong></a> </h3>
            </li>
          </ul> 
		  </div>
        </div>  
        
       	<div class="content">
		<p>

		<div class="sidebar_center_profile">
					<br />
					
					  <h3 class="style22" >Welcome<label> <%= request.getSession().getAttribute("name") != null ? request.getSession().getAttribute("name") : "Guest" %> </label>!</h3>
					<p align="center">
					<img align="middle" width="200" height="200" alt="" src="data:image/jpeg;base64,<%= request.getSession().getAttribute("userImage")%>">
					
					<br align="center" />
			<label id="lbluname"><span class="style23">@Administrator</span></label>
			<p>
			
	     </div>
		<div class="sidebar_center_profile">
					<br />

			<h3>Ministry Roles & Responsibilities</h3>
<p align="justify" class="style4">
The web administrator is responsible for the coordination and administration of the Web pages. Specifically, the web administrator's responsibilities are :
</p><p><ul>
<li>
Assisting with and coordinating the development of business unit plans for the Web site

</li>
<li> Promoting the use of the Web site amoung users  </li>
<li> Publishing information to the Web, when requested  </li>
<li>Ensuring all web pages follow ministry and government standards, policies and procedures   </li>
<li>Actively monitoring the web site for compliance to standards   </li>
<li> Removing inaccurate or outdated information from web site  </li>
<li>Assisting web page owners with web-related questions, issues etc.   </li>
<li> Providing a source of contact for all web page owners within the business unit  </li>
<li> Participating in the Web Administrators Working Group  </li>
<li> Communicating business and technical requirements to the Web Servicess  </li>
<li> Communicating new information regarding web initiatives to others within the Business Unit  </li>

</ul>	
		
		  </div>
		  
       </div>
      </div>
        
      </div>
        
        <jsp:include page="footer.jsp" />
</body>
</html>