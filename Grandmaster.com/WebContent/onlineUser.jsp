<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.grandmaster.db.entity.UserList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Online Players</title>
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
            <li> <h3><a href="position.jsp" ><strong>My Position</strong></a> </h3>
            </li>
      
            <li> <h3><a href="scores.jsp" ><strong>Highest Scores</strong></a> </h3>
            </li>
            <li> <h3><a href="history.jsp" ><strong>My Games</strong></a> </h3>
            </li>
          </ul> 
		  
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
					<br /><h3>Online Players</h3>
				<div align="center"> 
		<table width="780" height="149" border="0" cellspacing="3px">
          <tr>
           
            <th width="200" scope="col"><div align="center"><span class="style20">Name</span></div></th>
            <th width="160" scope="col"><div align="center"><span class="style20">Country</span></div></th>
            <th width="90" scope="col"><div align="center"><span class="style20">Rating</span></div></th>
            <th width="120" scope="col"><div align="center"><span class="style20">Action</span></div></th>
           
   
          </tr>
          
          <%
          	UserList userList = (UserList) request.getAttribute("onlineUsers");
          	if (userList == null){
          	    
          	}else{
          	    List<Map<String, String>> onlineUserList = userList.getOnlineUsers();
          	    for (Map<String, String> onlineUser : onlineUserList){
          	  %>
          	<tr>
            <td><%=onlineUser.get("name") %></td>
            <td><%=onlineUser.get("country") != null ? onlineUser.get("country") : "Not available" %></td>
            <td><%=onlineUser.get("rating") %></td>
            <td align="center"><input type="submit" name="btnSubmit" value="      Challenge      " style="height:37px" /></td>
           
          </tr>
          <%	   }     
          	    }
          %>
        </table>	
			</div>		  
			
	     </div>
		
		  
       </div>
      </div>
        
      </div>
        
        <jsp:include page="footer.jsp" />
</body>
</html>