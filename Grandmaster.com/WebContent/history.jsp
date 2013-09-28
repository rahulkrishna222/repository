<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Gaming History</title>
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
           <li> <h3><a href="home.jsp" ><strong>My Home</strong></a> </h3>
            </li>
             <li> <h3><a href="onlineUserList.html" ><strong>New Game</strong></a> </h3>
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
        <div class="sidebar_profile"> 
		<br />
		<article class="col-1">
                	
		  <a href="http://www.desktopnexus.com/tag/chess/"><img width="220"  height="220" alt="" src="images/gallery3.png"> </a>
		             
		     </article>
                
        </div>
        
        </div>
		<div class="content">
		<p>

		<div class="sidebar_center_history">
					<br />
				<div align="center"> 
		<table width="780" height="149" border="0" cellspacing="3px">
          <tr>
            <th width="48" scope="col"><span class="style20">No.</span></th>
            <th width="140" scope="col"><div align="center"><span class="style20">Date</span></div></th>
            <th width="220" scope="col"><div align="center"><span class="style20">Opponent</span></div></th>
            <th width="90" scope="col"><div align="center"><span class="style20">Opponent Score</span></div></th>
            <th width="90" scope="col"><div align="center"><span class="style20">Your Score</span></div></th>
            <th width="90" scope="col"><div align="center"><span class="style20">Time</span></div></th>
            <th width="90" scope="col"><div align="center"><span class="style20">Status</span></div></th>
   
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          
          <tr>
           <td colspan="6">
			 <div align="left"><a href="#">&lt;&lt;prev</a></div></td>
             
            <td><div align="right"><a href="#">Next&gt;&gt;</a></div></td>
          </tr>
        </table>	
			</div>		  
			
	     </div>
		
		  
       </div>
      </div>
        
      </div>
        
        <jsp:include page="footer.jsp" />
</body>
</html>