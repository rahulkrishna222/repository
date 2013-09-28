<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Grandmaster.com</title>
<jsp:include page="dependencies.jsp" />

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
		
		</div>
		</header>
		
		
		
		

		<div id="site_content">
		        <div id="sidebar_container">
	  <br />
	    
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
        <div class="sidebar_profile"> 
		<br />
		<article class="col-1">
                	
		  <a href="http://www.desktopnexus.com/tag/chess/"><img width="220"  height="220" alt="" src="images/gallery3.png"> </a>
		             
		     </article>
                
        </div>
        
        </div>
		<div class="content">
		<p>

		 <div class="sidebar_center_profile">
					<br />
			<div align="center"> 
		
		            <br />
		            <p>
		            <br />
		            <br />
		            <p>
		            <br />
		            <br />
		            <p>
		            <br />
		            		<div id="userSaveFailed">  <h2> <%= request.getAttribute("message") %></h2>   </div>
		            <br />
		            <p>
		            <br />
		            <br />
		            <p>
		            <br />
		            <br />
		            <p>
		            <br />
		 			
		
		
			</div>		  
			
	      </div>
		
		  
        </div>
      </div>
        
      </div>
        
        <jsp:include page="footer.jsp" />
</body>
</html>