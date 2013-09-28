<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Home</title>
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
             <li> <h3><a href="onlineUserList.html" ><strong>New Game</strong></a> </h3>
            </li>
            <li> <h3><a href="history.jsp" ><strong>My Games</strong></a> </h3>
            </li>
            
            <li> <h3><a href="position.jsp" ><strong>My Position</strong></a> </h3>
            </li>
      
            <li> <h3><a href="scores.jsp" ><strong>Highest Scores</strong></a> </h3>
            </li>
            <li> <h3><a href="onlineUserList.html" ><strong>Online Friends</strong></a> </h3>
            </li>
          </ul> 
		  
        </div>  
        <div class="sidebar_profile"> 
		 <br />
		<article class="col-1">
                	<a href="onlineUserList.html"><img class="img-border" src="images/banner111.png" alt=""></a>  <br />  </article> 
                <article class="col-1">
               
                <p>
				</div>
        <div class="sidebar_profile"> 
		<br />
		<article class="col-1">
                	<a href="rules.jsp"><img src="images/banner22.png" alt="" class="img-border"></a>                </article>
          <p>
          <br />
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
			<label id="lbluname"><span class="style23"><%= request.getSession().getAttribute("uName") != null ? request.getSession().getAttribute("uName") : "Guest" %></span></label>
			<p>
			
	     </div>
		<div class="sidebar_center_profile">
					<br />

			<h3>Be a Fighter</h3>
<p align="justify" class="style4">
Fight on move after move and don't play only half-hearted when you are in a bad position. If you lose heart you don't see your saving moves because your mental abilities are reduced. If you fight on, your opponent might make a mistake because he does not expect such hard resistance. In the long run such an attitude will save half a point here and there. Instead of losing, you might make a draw or even win, because he gets tired and makes a blunder.
</p><p>- See more at: <a href="http://www.expert-chess-strategies.com/chess-tips.html#sthash.rTIwI1BF.dpuf">http://www.expert-chess-strategies.com/chess-tips.html#sthash.rTIwI1BF.dpuf</a>	
		<div align="center"> 
		
		  <a href="onlineUserList.html"><img width="200"  height="200" alt="" src="images/gallery1.png"> </a>
		  </div>
		  </div>
		  <div class="sidebar_center_profile"><br />
		 <h3>Fun Collections</h3><p>
		  Download high quality chess graphics, wallpapers for a desktop of a chess player, chess fan, artist or an art lover. Big collection of chess wallpapers, images is available for everyone amd is growing every day !
		  <p>
		  <div align="center">
		  <a href="http://www.desktopnexus.com/tag/chess/"><img width="200"  height="200" alt="" src="images/gallery3.png"> </a>
		  </div>
		
        </div>
       </div>
      </div>
        
      </div>
        
        <jsp:include page="footer.jsp" />
</body>
</html>