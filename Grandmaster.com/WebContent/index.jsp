<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<jsp:include page="dependencies.jsp" />
<style type="text/css">
<!--
.style2 {
	color: #FFFF00
}

.style4 {
	color: #FFFFFF
}

.style15 {
	color: #00FF00
}
-->
</style>
</head>

<body class="body_bg">
	<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
			
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
	    <div class="sidebar"> 
		<br />
          <ul>
            <li> <h3><a href="#" ><strong>Sign In</strong></a> </h3>
            </li>
          </ul> 
		  
        </div>  
		 <div class="sidebar"> 
		 <br />
		<article class="col-1">
                	<a href="game.html"><img class="img-border" src="images/banner1.png" alt=""></a>  <br />  </article> 
                <article class="col-1">
               
                <br />
				</div>
        <div class="sidebar"> 
		<br />
		<article class="col-1">
                	<a href="rules.html"><img src="images/banner2.png" alt="" width="290" height="149" class="img-border"></a>                </article>
          <br />
          <br />
        </div>
        <div class="sidebar"> 
        <br />
		   <article class="col-2">
                	<a href="register.html"><img src="images/banner3.png" alt="" width="290" height="149" class="img-border"></a>                </article>
       <br />
       <br />
        </div>  
      </div>
      <div class="content">
	  
	 <div class="wrapper img-indent-bot"> 
                <!--<article class="col-1">
                	<a href="game.html"><img class="img-border" src="images/banner1.png" alt=""></a>   </article> 
                -->
               
        </div> 
		<div class="sidebar_large"> 
	 <h3>About the Chess Gaming </h3>
	 <p align="justify" class="style4"> <br />

       <span class="style15">It's never to late to learn how to play chess - the most popular game in the world! If you are totally new to the game or even want to learn all of the rules and strategies, read on!</span>
	   <p>
 The origins of chess are not exactly clear, though most believe it evolved from earlier chess-like games played in India almost two thousand years ago.The game of chess we know today has been around since the 15th century where it became popular in Europe.
</p>
<p>
Chess is a game played between two opponents on opposite sides of a board containing 64 squares of alternating colors. Each player has 16 pieces: 1 king, 1 queen, 2 rooks, 2 bishops, 2 knights, and 8 pawns. The goal of the game is to checkmate the other king. Checkmate happens when the king is in a position to be captured (in check) and cannot escape from capture. 
</p>      
	 <h3>
            <a href="#">Read more</a></h3>
		</div>
		<jsp:include page="services.jsp" />
		</div>
		</div>
		<jsp:include page="footer.jsp" />
		
</div>
</body>
</html>