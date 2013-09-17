<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Profile</title>
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
					<br />

				
		<div align="center"> <table width="669" cellpadding="0" cellspacing="7" class="style1">
          <!--class style="background:transparent;"-->
          <tr>
            <td  width="209" height="40"><dfn></dfn> <strong>Name </strong> </td>
            <td colspan="2"><dfn></dfn>
                <input name="txtfname" type="text" size="25"></td>
            <td colspan="2"><dfn></dfn>
                <input name="txtlname" type="text" size="25"></td>
          </tr>
          
          <tr>
            <td width="209" height="40"><strong>Birthday </strong></td>
            <td width="100"><dfn></dfn>
                <label>
                <select name="ddlday" size="1" style="width:65px">
                </select>
              </label></td>
            <td width="100"><dfn></dfn>
                <select name="ddlmonth" size="1" style="width:65px">
              </select></td>
            <td width=""><dfn></dfn>
                <select name="ddlyear" size="1" style="width:65px">
              </select></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Gender </strong></td>
            <td colspan="3"><dfn></dfn>
                <select name="ddlsex" size="1" style="width:65px">
              </select></td>
            </tr>
          <tr>
            <td width="209" height="40"><strong>email address </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtemail" type="text" size="40"></td>
          </tr>
           <tr>
            <td width="209" height="40"><strong>Address</strong></td>
            <td colspan="4"><dfn></dfn>
            <textarea name="txtAaddr1"></textarea>
              </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Permanent Address</strong></td>
            <td colspan="4"><dfn></dfn>
            <textarea name="txtAaddr1"></textarea>
              </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>City </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtcity" type="text" size="40"></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>State</strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtstate" type="text" size="40"></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Zip code</strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtzip" type="text" size="40"></td>
          </tr>
           <tr>
            <td width="209" height="40"><strong>Location</strong></td>
            <td colspan="4"><dfn></dfn>
              <select name="ddlcountry" size="1" style="width:65px">
              </select></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Mobile phone </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtmob" type="text" size="40"></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Home phone </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtmob" type="text" size="40"></td>
          </tr>
          
         
		  <tr>
            <td height="40" colspan="5"><dfn></dfn> <dfn></dfn>
            <label>
            <div align="center">
            <input type="submit" name="btnedit" value="   Edit   " style="height:37px">
           
           
            
              <input type="submit" name="btnsubmit" value="   Submit   " style="height:37px">
            </div>
            </label></td>
          </tr>
        </table>
        </div>
               </div>
        </div>
        <jsp:include page="footer.jsp" />
</body>
</html>