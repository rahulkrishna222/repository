<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<head>
<title>Feedback Reply</title>
<jsp:include page="dependencies.jsp" />
</head>
<body>
<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>
		
		 <div id="site_content"> 
        
	    
        <div class="content">
	
		
			<div class="sidebar_center_l">
			<br />
			<table align="center"> 
			<tr>
			<td  > <table>
					<tr>
						<td  ><h3 align="center" class="style19">User Details</h3>
                        
                        <dl>
                            <dt>&nbsp;</dt>
                            <dd  ><span>Uname:</span><label title="lbluname">uname</label></dd>
                            <dd  ><span>Email:</span><label title="lbluname">email</label></dd>
                            <dd ><span>Subject:</span><label title="lbluname">subject</label></dd>
                            <dd  ><span></span><textarea name="txtAmessage" cols="30" rows="10" id="message"></textarea></dd>
                        </dl> </td>
					</tr>
				  </table>
			</td>
			<td >
		 <h3 align="center" class="style19">Reply Form</h3>
		 <div align="center"><br />
		<table align="center" style="color:#9966FF">
		
		<td >Subject:</td><td ><input name="txtsubject" type="text" id="email"></td>
		</tr>
		<tr>
		<td  >Your Reply:</td><td ><textarea name="txtAReplymessage" cols="30" rows="10" id="message"></textarea></td>
		</tr>
         </table> 
            <input name="send" type="submit" id="send" value="         Send         " style="height:37px">
		 </div>
		
		</td>
		</tr>
		</table>
       
     </div>
	 </div> 

  </div>
</div>
	<jsp:include page="footer.jsp" />
</body>
