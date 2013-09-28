<%@page import="com.grandmaster.db.entity.UserProfile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>User Details</title>
<jsp:include page="dependencies.jsp" />


<style type="text/css">

.tb{border:1px solid #36F;}

</style>




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
			<jsp:include page="mainMenu.jsp" />
		</header>

		<div id="site_content">
		        <div id="sidebar_container">
	  <br />
	    <div class="sidebar_profile"> 
		<br />
          <ul>
          <li> <h3><a href="Admin.jsp" ><strong>My Home</strong></a> </h3>
            </li>
                      
            <li> <h3><a href="#" ><strong>Gaming History</strong></a> </h3>
            </li>
            
            <li> <h3><a href="#" ><strong>Position</strong></a> </h3>
            </li>
      
            <li> <h3><a href="#" ><strong>Highest Scores</strong></a> </h3>
            </li>
           
          </ul> 
		  
        </div>  
        
        
        </div>
		<div class="content">
		<p>

		<div class="sidebar_center_profile">
					<br />
					<h3 align="center" class="style22" >Profile</h3>
					<p align="center">
					<img align="middle" width="100" height="100" alt="" src="images/gallery3.png">
					<br />
					
					</p>
		  <p align="center">
<label id="lblname"><span class="style21"> <%= request.getSession().getAttribute("name") != null ? request.getSession().getAttribute("name") : "Guest" %></span></label>
					<br align="center" />
			<label id="lbluname"><span class="style23"> <%= request.getSession().getAttribute("uName") != null ? request.getSession().getAttribute("uName") : "Guest" %></span></label>
			<p>
			
	     </div>
		<div class="sidebar_center_profile">
					<br />

		<%
			UserProfile user = (UserProfile) request.getAttribute("user");
			if (user == null){
			    request.setAttribute("message", "Unhandled exception occured");
			    request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		%>
		<div align="center">		
		<form method="post" action="user_profile_update.do">
		<table width="669" cellpadding="0" cellspacing="7" class="style1">
          <!--class style="background:transparent;"-->
          <tr>
            <td  width="209" height="40"><dfn></dfn> <strong>Name </strong> </td>
            <td colspan="2"><dfn></dfn>
                <input disabled="disabled" name="txtfname" type="text" size="25" value=<%=user.getFirstName() != null ? user.getFirstName() : "" %>></td>
            <td colspan="2"><dfn></dfn>
                <input disabled="disabled"  name="txtlname" type="text" size="25" value=<%=user.getFirstName() != null ? user.getLastName() : "" %>></td>
          </tr>
          
          <tr>
            <td width="209" height="40"><strong>Birthday </strong></td>
            <td width="100"><dfn></dfn>
                <input  disabled="disabled" type="text" id="datepicker" name="txtDob" />
                </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Gender </strong></td>
            <td colspan="4"><dfn></dfn>
                <select  disabled="disabled"  name="ddlsex" size="1" style="width:100px">
                  <option>Male</option>
                  <option>Female</option>
                </select></td>
            </tr>
          <tr>
            <td width="209" height="40"><strong>Email address </strong></td>
            <td colspan="4"><dfn></dfn>
                <input disabled="disabled"  name="txtemail" type="text" size="40" value=<%=user.getEmail() != null ? user.getEmail() : "" %>></td>
          </tr>
           <tr>
            <td width="209" height="40"><strong>Address</strong></td>
            <td colspan="4"><dfn></dfn>
            <textarea  disabled="disabled"  name="txtAaddr1" wrap="soft"><%=user.getAddress1() != null ? user.getAddress1() : "" %></textarea>
              </td>
          </tr>
          
          <tr>
            <td width="209" height="40"><strong>City </strong></td>
            <td colspan="4"><dfn></dfn>
                <input disabled="disabled"  name="txtcity" type="text" size="40" value=<%=user.getCity() != null ? user.getCity() : "" %> ></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>State</strong></td>
            <td colspan="4"><dfn></dfn>
                <input disabled="disabled"  name="txtstate" type="text" size="40" value=<%=user.getState() != null ? user.getState() : "" %>></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Zip code</strong></td>
            <td colspan="4"><dfn></dfn>
                <input  disabled="disabled" name="txtzip" type="text" size="40" value=<%=user.getZipCode() != null ? user.getZipCode() : "" %>></td>
          </tr>
           <tr>
            <td width="209" height="40"><strong>Location</strong></td>
            <td colspan="4"><dfn></dfn>
              <select disabled="disabled"  name="ddlcountry" size="1" style="width:180px">
                <option>India</option>
                <option>Afghanistan</option>
                <option>Armenia</option>
                <option>Bahrain</option>
                <option>Bangladesh</option>
                <option>Bhutan</option>
                <option>Burma</option>
                <option>Cambodia</option>
                <option>China</option>
                <option> East Timor</option>
                <option>Georgia</option>
                <option> India</option>
                <option> Indonesia</option>
                <option> Iran</option>
                <option> Iraq</option>
                <option>Japan</option>
                <option>Kuwait</option>
                <option>Malaysia</option>
                <option>Malaysia</option>
                <option>Oman</option>
                <option>Pakistan</option>
                <option>Qatar</option>
                <option> Russia</option>
                <option>Sri Lanka</option>
                <option>Syria</option>
                <option> Thailand</option>
                <option>Vietnam</option>
                <option> Yemen</option>
              </select></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Mobile phone </strong></td>
            <td colspan="4"><dfn></dfn>
                <input  disabled="disabled" name="txtmob" type="text" size="40" value=<%=user.getMobileNumber() != null ? user.getMobileNumber() : "" %>></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Home phone </strong></td>
            <td colspan="4"><dfn></dfn>
                <input disabled="disabled"s name="txtph" type="text" size="40" value=<%=user.getHomeNumber() != null ? user.getHomeNumber() : "" %>></td>
          </tr>
          
         
		  <tr>
            <td  height="40" colspan="5"><dfn></dfn> <dfn></dfn>
            <label>
            <div align="center">
                       
                     
              <input type="submit" name="btnsubmit" value="        Block User        " style="height:37px">
            </div>
            </label></td>
          </tr>
        </table>
        </form>
        </div>
               </div>
        </div>
        
      </div>
        
        <jsp:include page="footer.jsp" />
</body>
</html>