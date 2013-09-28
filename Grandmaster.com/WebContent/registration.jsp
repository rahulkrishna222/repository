<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Registration</title>
<link rel="stylesheet" href="css/jquery-ui.css" />
  <script src="js/jquery-1.9.1.js"></script>
  <script src="js/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css" />
<jsp:include page="dependencies.jsp" />

<style type="text/css">
<!--
.style18 {color: #48678C}
.style19 {color: #CC0000}
-->
</style>


<style type="text/css">

.tb{border:1px solid #36F;}

.custom_error{background-image:url(images/error.png);background-repeat:no-repeat;background-position:right;}

.error_free{background-image:url(images/accept.png);background-repeat:no-repeat;background-position:right;}

</style>


<script>

function next(e,n){
	
	if(document.getElementsById(e)=="txtFname"){
		alert("yes");
		var i=document.getElementsByName(n);
		i.focus();
	}
}

</script>



<script>
function validate_ph()
{
var x=document.forms["myForm"]["txtMob"].value;
var atpos=x.indexOf('^[a-z]');
 if(atpos>0){
  alert("Not a valid Phone Number");

  return false;
 }
}
</script>



<script>
function validateForm()
{
var x=document.forms["myForm"]["txtEmail"].value;
var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");
if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
  {
  var i = document.getElementById(lblEmail);
 
  alert("Not a valid e-mail address");
  return false;
  }
}
</script>


<script type="text/javascript">

function validate_field_test(field,lbl) {
	   if(isEmptyField_test(field,lbl)) {

		   return false;

		}
	   return true;
}

function isEmptyField_test(e, r) {

	var i = document.getElementById(r);

	if(e.value.replace(/\s+$/, "") == "") {

	i.className = "";
	i.innerHTML = "&nbsp;&nbsp;&nbsp;";

	i.className = "custom_error";
	e.value = "";

	e.focus();

	return true;

	}
	
		return false;

}

</script>


<script type="text/javascript">

function validate_field(e) {
	   if(isEmptyField(e["txtFname"],"lblFname")) {

		   return false;

		}
	    if(isEmptyField(e["txtLname"],"lblLname")) {

			return false;

		}

	    if(isEmptyField(e["txtPswd"],"lblPswd")) {

			return false;

		}

	    if(isEmptyField(e["txtConpswd"],"lblConfPswd")) {

			return false;

		}

	    if(isEmptyField(e["txtUname"],"lblUname")) {

			return false;

		}

	    if(isEmptyField(e["ddlDay"],"lblDay")) {

			return false;

		}

	    if(isEmptyField(e["ddlMonth"],"lblMonth")) {

			return false;

		}

	    if(isEmptyField(e["ddlYear"],"lblYear")) {

			return false;

		}

	    if(isEmptyField(e["txtPswd"],"lblPswd")) {

			return false;

		}

	    if(isEmptyField(e["ddlSex"],"lblSex")) {

			return false;

		}

	    if(isEmptyField(e["txtMob"],"lblMob")) {

			return false;

		}

	    if(isEmptyField(e["txtEmail"],"lblEmail")) {

			return false;

		}

	    if(isEmptyField(e["txtCaptcha"],"lblCaptcha")) {

			return false;

		}

	    if(isEmptyField(e["ddlCountry"],"lblCountry")) {

			return false;

		}
	 
	 return true;

}

function isEmptyField(e, r) {

	var i = document.getElementById(r);

	if(e.value.replace(/\s+$/, "") == "") {

	i.className = "";
	i.innerHTML = "&nbsp;&nbsp;&nbsp;";

	i.className = "custom_error";
	e.value = "";

	e.focus();

	return true;

	}
	else {

		
		i.innerHTML = "&nbsp;&nbsp;&nbsp;";

		i.className = "error_free";
		e.className = "tb";

		return false;

	}

}

</script>

<script>
  $(function() {
    $( "#datepicker" ).datepicker({
      changeMonth: true,
      changeYear: true
    });
  });
  </script>
	


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
		<article class="col-1">
                	<ul>
             <li> <h3> It's never to late to join ! Hurry up ! </h3></li></ul> <br />  </article> 
                
               
                <p><br /></p>
				</div>
		<div class="sidebar_profile">
		   <br />
		<article class="col-1">
                	<a href="onlineUserList.html"><img class="img-border" src="images/banner111.png" alt=""></a>  <br />  </article> 
                
               
                <p><br /></p>
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

		<div class="sidebar_center_profile">		<br />

<h3 align="center" class="style19"> <strong>Create a new Account</strong></h3>
		<p align="center" class="style19">&nbsp;</p>
		
		<div align="center">
		<form id="myForm" name="myForm" action="register.html" method="post" onsubmit="validateForm();">
		 <table width="669" cellpadding="0" cellspacing="7" class="style1">
          <!--class style="background:transparent;"-->
          <tr style="border-bottom-color: #22003C">
            <td  style=" background-color: #22003C"  width="209" height="40"><dfn></dfn> <strong>Name</strong> </td>
            <td   style=" background-color: #22003C"  colspan="2"><dfn></dfn>
                <input name="txtFname" id="txtFname" class="tb" type="text" size="25" onBlur="javascript:validate_field_test(this, 'lblName');" onchange="javascript:next(this, 'txtLname');">
                <label id="lblName" style="color: red; font-style: italic;"></label>
                </td>
            <td   style=" background-color: #22003C"  colspan="2"><dfn></dfn>
                <input name="txtLname" id="txtLname" class="tb" type="text" size="25" onBlur="javascript:validate_field_test(this, 'lblLname');">
                <label id="lblLname" style="color: red; font-style: italic;"></label></td>
          </tr>
          <tr>
            <td   style=" background-color: #22003C"  width="209" height="40"><strong>Username </strong></td>
            <td   style=" background-color: #22003C"  colspan="4"><dfn></dfn>
                <input name="txtUname" type="text" size="40" class="tb" disabled="disabled" >
                
                </td>
          </tr>
          
          <tr>
            <td   style=" background-color: #22003C"  width="209" height="40"><strong>Create a password </strong></td>
            <td   style=" background-color: #22003C"  colspan="4"><dfn></dfn>
                <input name="txtPswd" type="password" size="40" class="tb" onBlur="javascript:validate_field_test(this, 'lblPswd');">
                <label id="lblPswd" style="color: red; font-style: italic;"></label>
                </td>
                
          </tr>
          <tr>
            <td width="209" height="40"><strong>Confirm your password </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtConpswd" type="password" size="40" class="tb" onBlur="javascript:validate_field_test(this, 'lblConfPswd');">
                <label id="lblConfPswd" style="color: red; font-style: italic;"></label>
                </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Birthday </strong></td>
            <td width="100"><dfn></dfn>
                <input type="text" id="datepicker" />
              </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Gender </strong></td>
            <td colspan="2"><dfn></dfn>
                <select name="ddlSex" size="1" style="width:80px" class="tb">
                <option value="M">Male</option>
                <option value="F">Female</option>
              </select>
              <label id="lblSex" style="color: red; font-style: italic;"></label>
              </td>
            <td colspan="2"><dfn></dfn> </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Mobile phone </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtMob" class="tb" type="text" size="40" class="tb" onBlur="javascript:validate_field(this, 'lblMob');" onchange="javascript:validate_ph();">
                <label id="lblMob" style="color: red; font-style: italic;"></label>
                </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Your current email address </strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtEmail" id="txtEmail" type="text" size="40" class="tb" onchange="javascript:validateForm();">
                <label id="lblEmail" style="color: red; font-style: italic;"></label>
                </td>
          </tr>
          <tr>
            <td colspan="5" height="40"><dfn></dfn>  <strong> Prove you're not a robot </strong></td>
          </tr>
          <tr>
            <td width="209" height="40"><strong><img name="captcha" src="" width="189" height="76" alt=""></strong></td>
            <td colspan="4"><dfn></dfn>
                <input name="txtCaptcha" type="text" size="40" class="tb">
                <label id="lblCaptcha" style="color: red; font-style: italic;"></label>
                </td>
          </tr>
          <tr>
            <td width="209" height="40"><strong>Location</strong></td>
            <td colspan="4"><dfn></dfn>
              <select name="ddlcountry" size="1" style="width:180px">
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
              </select>
              <label id="lblCountry" style="color: red; font-style: italic;"></label>
              </td>
          </tr>
		  <tr>
            <td  height="40" colspan="5"><dfn></dfn> <dfn></dfn>
              <label>
              <input type="checkbox" name="chkbx" value="checkbox" class="tb">
            I agree to the Grandmaster.com <a href="Terms_Services.jsp">Terms of Service</a> and <a href="Terms_Services.jsp">Privacy Policy</a></label></td>
          </tr>
		  <tr>
            <td height="40" colspan="5"><dfn></dfn> <dfn></dfn>
            <label>
            <div align="center">
              <input type="submit" name="btnSubmit" value="      Submit      " style="height:37px" onclick="javascript:validate_field(this.form);">
            </div>
            </label></td>
          </tr>
        </table>
        </form>
        </div>
               </div>
               </div>
               </div>
        </div>
        <jsp:include page="footer.jsp" />
</body>
</html>