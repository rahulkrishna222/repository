<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Users</title>
<jsp:include page="dependencies.jsp" />

<style type="text/css">
<!--
.style18 {color: #48678C}
.style19 {color: #CC0000}
-->
</style>

</head>
<body>
<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>

		<div id="site_content">
		<div class="sidebar_center_l">
<h3 align="center"> <strong>User Details</strong></h3>
		<p align="center" class="style19">&nbsp;</p>
		
		<div align="center"> 
		<table  width="663" height="149" border="0" cellspacing="3px">
          <tr>
            <th  style=" background-color: #22003C" width="48" scope="col"><span class="style20">No.</span></th>
            <th style=" background-color: #22003C" width="140" scope="col"><div align="center"><span class="style20">Uname</span></div></th>
            <th style=" background-color: #22003C" width="140" scope="col"><div align="center"><span class="style20">Email</span></div></th>
            <th style=" background-color: #22003C" width="96" scope="col"><div align="center"><span class="style20">Date of joining</span></div></th>
            <th style=" background-color: #22003C" width="81" scope="col"><div align="center"><span class="style20">Status</span></div></th>
            <th style=" background-color: #22003C" width="65" scope="col">&nbsp;</th>
            <th style=" background-color: #22003C" width="65" scope="col">&nbsp;</th>
   
          </tr>
          <tr>
            <td style=" background-color: #22003C" >&nbsp;</td>
            <td style=" background-color: #22003C" >&nbsp;</td>
            <td style=" background-color: #22003C" >&nbsp;</td>
            <td style=" background-color: #22003C" >&nbsp;</td>
            <td style=" background-color: #22003C" > <label>status</label><label><input type="checkbox" name="chkbx" value="checkbox">Disable</label></td>
            <td style=" background-color: #22003C" ><a href="#">View</a></td>
            <td style=" background-color: #22003C" > <input type="submit" name="btnupdate" value=" Update "> </td>
          </tr>
          
          <tr>
           <td style=" background-color: #22003C"  colspan="6">
			 <div align="left"><a href="#">&lt;&lt;prev</a></div></td>
             
            <td style=" background-color: #22003C" ><div align="right"><a href="#">Next&gt;&gt;</a></div></td>
          </tr>
        </table>
        </div>
               </div>
        </div>
        <jsp:include page="footer.jsp" />
</body>
</html>