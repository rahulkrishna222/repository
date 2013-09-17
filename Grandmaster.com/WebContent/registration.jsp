<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Registration</title>
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

<h3 align="center" class="style19"> <strong>Create a new Account</strong></h3>
		<p align="center" class="style19">&nbsp;</p>
		
		<div align="center"> <table width="669" cellpadding="0" cellspacing="7" class="style1">
          <!--class style="background:transparent;"-->
          <tr style="border-bottom-color: #22003C">
            <td  style=" background-color: #22003C"  width="209" height="40"><dfn></dfn> <strong>Name</strong> </td>
            <td   style=" background-color: #22003C"  colspan="2"><dfn></dfn>
                <input name="txtfname" type="text" size="25"></td>
            <td   style=" background-color: #22003C"  colspan="2"><dfn></dfn>
                <input name="txtlname" type="text" size="25"></td>
          </tr>
          <tr>
            <td   style=" background-color: #22003C"  width="209" height="40"><strong>Choose your Username </strong></td>
            <td   style=" background-color: #22003C"  colspan="4"><dfn></dfn>
                <input name="txtuname" type="text" size="40"></td>
          </tr>
          
          <tr>
            <td   style=" background-color: #22003C"  width="209" height="40"><strong>Create a password </strong></td>
            <td   style=" background-color: #22003C"  colspan="4"><dfn></dfn>
                <input name="txtpswd" type="password" size="40"></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Confirm your password </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtconpswd" type="password" size="40"></td>
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
            <td colspan="2"><dfn></dfn>
                <select name="ddlsex" size="1" style="width:65px">
              </select></td>
            <td colspan="2"><dfn></dfn> </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Mobile phone </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtmob" type="text" size="40"></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Your current email address </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtemail" type="text" size="40"></td>
          </tr>
          <tr>
            <td colspan="5" height="40"><dfn></dfn>  <strong> Prove you're not a robot </strong></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong><img name="captcha" src="" width="189" height="76" alt=""></strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtcaptcha" type="text" size="40"></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Location</strong></td>
            <td colspan="4"><dfn></dfn>
              <select name="ddlcountry" size="1" style="width:65px">
              </select></td>
          </tr>
		  <tr>
            <td  height="40" colspan="5"><dfn></dfn> <dfn></dfn>
              <label>
              <input type="checkbox" name="chkbx" value="checkbox">
            I agree to the Grandmaster.com <a href="#">Terms of Service</a> and <a href="#">Privacy Policy</a></label></td>
          </tr>
		  <tr>
            <td height="40" colspan="5"><dfn></dfn> <dfn></dfn>
            <label>
            <div align="center">
              <input type="submit" name="btnsubmit" value="      Submit      " style="height:37px">
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