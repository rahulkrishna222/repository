<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Messages </title>
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
<h3 align="center"> <strong>Fedback Messages</strong></h3>
		<p align="center" class="style19">&nbsp;</p>
		
		<div align="center"> 
		<table width="663" height="149" border="0" cellspacing="3px">
          <tr>
            <th width="48" scope="col"><span class="style20">No.</span></th>
            <th width="140" scope="col"><div align="center"><span class="style20">Uname</span></div></th>
            <th width="85" scope="col"><div align="center"><span class="style20">Date</span></div></th>
            <th width="216" scope="col"><div align="center"><span class="style20">Subject</span></div></th>
            <th width="81" scope="col"><div align="center"><span class="style20">Status</span></div></th>
            <th width="65" scope="col">&nbsp;</th>
   
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><a href="#">View</a></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
           <td colspan="5">
			 <div align="left"><a href="#">&lt;&lt;prev</a></div></td>
             
            <td><div align="right"><a href="#">Next&gt;&gt;</a></div></td>
          </tr>
        </table>
        </div>
               </div>
        </div>
        <jsp:include page="footer.jsp" />
</body>
</html>