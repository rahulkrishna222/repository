<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Game</title>

<jsp:include page="dependencies_game.jsp" />
<script src="js/chess_board_white.js"></script>

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


<script type="text/javascript">

var count=30;

var counter=setInterval(timer, 1000);

function timer()
{
  count=count-1;
  if (count <= 0)
  {
     clearInterval(counter);
     return;
  }

 document.getElementById("timer").innerHTML=count + " secs"; 
}



</script>

<script type="text/javascript">

var mins = 30; 
var secs = mins * 60;
var currentSeconds = 0;
var currentMinutes = 0;
setTimeout('Decrement()',1000);

function Decrement() {
    currentMinutes = Math.floor(secs / 60);
    currentSeconds = secs % 60;
    if(currentSeconds <= 9) currentSeconds = "0" + currentSeconds;
    secs--;
    document.getElementById("timerText").innerHTML = currentMinutes + ":" + currentSeconds; 
    if(secs !== -1) setTimeout('Decrement()',1000);
}


</script>

<script type="text/javascript">

$(document).ready (function () {
    startCount();
});
 
function startCount()
{
	timer = setInterval(count,1000);
}
function count()
{
	var time_shown = $("#realtime").text();
        var time_chunks = time_shown.split(":");
        var hour, mins, secs;
 
        hour=Number(time_chunks[0]);
        mins=Number(time_chunks[1]);
        secs=Number(time_chunks[2]);
        secs++;
            if (secs==60){
                secs = 0;
                mins=mins + 1;
               } 
              if (mins==60){
                mins=0;
                hour=hour + 1;
              }
              
 
        $("#realtime").text(hour +":" + plz(mins) + ":" + plz(secs));
 
}
 
function plz(digit){
 
    var zpad = digit + '';
    if (digit < 10) {
        zpad = "0" + zpad;
    }
    return zpad;
}



</script>




<script type="text/javascript">

$(document).ready (function () {
    startCountA();
});
 
function startCountA()
{
	timer = setInterval(countA,1000);
}
function countA()
{
	var time_shown = $("#realtimeA").text();
        var time_chunks = time_shown.split(":");
        var hour, mins, secs;
 
        hour=Number(time_chunks[0]);
        mins=Number(time_chunks[1]);
        secs=Number(time_chunks[2]);
        secs++;
            if (secs==60){
                secs = 0;
                mins=mins + 1;
               } 
              if (mins==60){
                mins=0;
                hour=hour + 1;
              }
              
 
        $("#realtimeA").text(hour +":" + plzA(mins) + ":" + plzA(secs));
 
}

function plzA(digit){
 
    var zpad = digit + '';
    if (digit < 10) {
        zpad = "0" + zpad;
    }
    return zpad;
}



</script>



</head>
<body onload='draw();'>
<div id="main">
		
		
		

		
		        <div id="sidebar_container">
	  <br />
	  <br />
	  <br />
	  
	 
	  
	 
	  		 <table>
	  		 <tr>
           		<td width="55" scope="col">   <img width="50" height="50" src="images/thumb1.jpg" /></td>
         		<td width="190" scope="col"> <label id="lblB">Player_B</label></td>
         		<td width="120" scope="col"><span id="realtime">00:00:00</span>    </td>       
         	</tr>
           	</table>
       <br />
	  <br />
	  
	 
	  
	    <div class="sidebar_profile"> 
		<br />
         <label style=" white-space: pre;">              </label> <input type="submit" name="btnSubmit" value="                  Quit                  " style="height:37px" />
          <p><br/>
         <label style=" white-space: pre;">              </label> <input type="submit" name="btnSubmit" value="              Help Me             " style="height:37px" />
		  
        </div> 
        <div>
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
	  
	  
	  </div> 
        <table>
         	<tr>
         		<td width="55" scope="col">   <img width="50" height="50" src="images/thumb6.jpg" /></td>
         		<td width="190" scope="col"> <label id="lblA">Player_A</label></td>
         		<td width="120" scope="col"><span id="realtimeA">00:00:00</span>    </td>
         	</tr>
         </table>
       
        
        </div>
		
		
         
        
         
         
         
		<div class="sidebar_center_history">
			
				<label style=" white-space: pre;">                                  </label>
				<canvas id="chess" width="600" height="600"></canvas>
			
	<p>
	  </div>
		
		  
       
      
        
      </div>
        
      </body>
</html>