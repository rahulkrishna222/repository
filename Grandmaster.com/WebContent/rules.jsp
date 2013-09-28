 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Game Rules</title>
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
		
		<div id="site_content">
      
      <div class="content">
	  
	 <div class="wrapper img-indent-bot"> 
               
               
        </div> 
		<div class="sidebar_larger">
	 <h3>The Goal of Chess</h3>
	 <p align="justify" class="style4">
<div align="justify">Chess is a game played between two opponents on opposite sides of a   board containing 64 squares of alternating colors. Each player has 16   pieces: 1 king, 1 queen, 2 rooks, 2 bishops, 2 knights, and 8 pawns. The   goal of the game is to checkmate the other king. Checkmate happens when   the king is in a position to be captured (in check) and cannot escape   from capture. </div>
      <p align="justify" class="style4">     
	  <h3>Starting a Game</h3>
	  <br />
	  <div class="sidebar_l_m">
	  <br />
	  <div align="justify">At the beginning of the game the chessboard is laid out so that each   player has the white (or light) color square in the bottom right-hand   side. The chess pieces are then arranged the same way each time. The   second row (or rank) is filled with pawns. The rooks go in the corners,   then the knights next to them, followed by the bishops, and finally the   queen, who always goes on her own matching color (white queen on white,   black queen on black), and the king on the remaining square. 
                              <p>The player with the white pieces always moves first. Therefore,   players generally decide who will get to be white by chance or luck such   as flipping a coin or having one player guess the color of the hidden   pawn in the other player's hand. White then makes a move, followed by   black, then white again, then black and so on until the end of the game. </p>
                            </div>
           </div>
           
                          <div align="center">  <img align="middle" alt="" src="images/chess-bard.png"></div>
                          <p>
            
           <p>               
           <h3>How the Pieces Move</h3>
           <br />
           <div align="justify">Each of the 6 different kinds of pieces moves differently. Pieces cannot move through other pieces (though the knight can jump over other pieces), and can never move onto a square with one of their own pieces. However, they can be moved to take the place of an opponent's piece which is then captured. Pieces are generally moved into positions where they can capture other pieces (by landing on their square and then replacing them), defend their own pieces in case of capture, or control important squares in the game. </div>
           <br />
           <div class="sidebar_l_m"><br /><strong>The King</strong>
                <br />
                <p>
                <div align="justify">The king is the most important piece, but is one of the weakest. <p>The king can only move one square in any direction - up, down, to the sides, and diagonally.The king may never move himself into check (where he could be captured).</div>
                <p>
                </div>
    
		
		<div align="center">  <img align="middle" alt="" src="images/king.png"></div>
          <br />
           <div class="sidebar_l_m"><br /><strong>The Queen</strong>
                <br />
                <p>
                <div align="justify">The queen is the most powerful piece.<p> She can move in any one straight direction - forward, backward, sideways, or diagonally - as far as possible as long as she does not move through any of her own pieces.And, like with all pieces, if the queen captures an opponent's piece her move is over.</div>
                <p>
                </div>
    
		
		<div align="center">  <img align="middle" alt="" src="images/queen.png"></div>                
		<br />
          
           <div class="sidebar_l_m"><br /><strong>The Rook</strong>
                <br />
                <p>
                <div align="justify">The rook may move as far as it wants, but only forward, backward, and to the sides.<p> The rooks are particularly powerful pieces when they are protecting each other and working together!</div>
                <p>
                </div>
    
		
		<div align="center">  <img align="middle" alt="" src="images/rook.png"></div>
		
		<br />
           <div class="sidebar_l_m"><br /><strong>The Bishop</strong>
                <br />
                <p>
                <div align="justify">The bishop may move as far as it wants, but only diagonally. <p>Each bishop starts on one color (light or dark) and must always stay on that color.Bishops work well together because they cover up each other's weaknesses.</div>
                <p>
                </div>
    
		
		<div align="center">  <img align="middle" alt="" src="images/bishop.png"></div> 
		<br />
           <div class="sidebar_l_m"><br /><strong>The Knight</strong>
                <br />
                <p>
                <div align="justify">Knights move in a very different way from the other pieces - going two squares in one direction, and then one more move at a 90 degree angle, just like the shape of an 'L'. <p>Knights are also the only pieces that can move over other pieces.</div>
                <p>
                </div>
    
		
		<div align="center">  <img align="middle" alt="" src="images/knight.png"></div> 
		
		<br />
           <div class="sidebar_l_m"><br /><strong>The Pawn</strong>
                <br />
                <p>
                <div align="justify">Pawns are unusual because they move and capture in different ways: they move forward, but capture diagonally. <p>Pawns can only move forward one square at a time, except for their very first move where they can move forward two squares. Pawns can only capture one square diagonally in front of them. They can never move or capture backwards. If there is another piece directly in front of a pawn he cannot move past or capture that piece.</div>
                <p>
                </div>
    
		
		<div align="center">  <img align="middle" alt="" src="images/pawn.png"></div> 
		
		<br />
           <br /><strong>Promotion</strong>
                <br />
                <p>
                <div align="justify">Pawns have another special ability and that is that if a pawn reaches the other side of the board it can become any other chess piece (called promotion). A pawn may be promoted to any piece. [NOTE: A common misconception is that pawns may only be exchanged for a piece that has been captured. That is NOT true.] A pawn is usually promoted to a queen. Only pawns may be promoted.</div>
                <p>
              <br /><strong> En Passant</strong>
              <br />
<p>
The last rule about pawns is called "en passant," which is French for "in passing". If a pawn moves out two squares on its first move, and by doing so lands to the side of an opponent's pawn (effectively jumping past the other pawn's ability to capture it), that other pawn has the option of capturing the first pawn as it passes by. This special move must be done immediately after the first pawn has moved past, otherwise the option to capture it is no longer available.
    <br />
    <p>
  <strong>Castling</strong> 
<br />
<p>
One other special rule is called castling. This move allows you to do two important things all in one move: get your king to safety (hopefully), and get your rook out of the corner and into the game. On a player's turn he may move his king two squares over to one side and then move the rook from that side's corner to right next to the king on the opposite side. <p>However, in order to castle, the following conditions must be met:
<ul class="list-1">
	
			<li>
				<div>
    it must be that king's very first move</div></li>
   <li>
				<div> it must be that rook's very first move</div></li>
  <li>
				<div>  there cannot be any pieces between the king and rook to move</div></li>
 <li>
				<div>   the king may not be in check or pass through check</div></li>
				</ul>
    <br />
   <strong> Check & Checkmate</strong>
   <br />
   <p>
   <p>
As stated before, the purpose of the game is to checkmate the opponent's king. This happens when the king is put into check and cannot get out of check. There are only three ways a king can get out of check: move out of the way (though he cannot castle!), block the check with another piece, or capture the piece threatening the king. If a king cannot escape checkmate then the game is over. Customarily the king is not captured or removed from the board, the game is simply declared over.
<br />
<p>
<strong>Draws</strong> 
<br />
<p>
Occasionally chess games do not end with a winner, but with a draw. There are 5 reasons why a chess game may end in a draw:

   <ul class="list-1">
	
			<li>
				<div> The position reaches a stalemate where it is one player's turn to move, but his king is NOT in check and yet he does not have another legal move</div></li>
  <li>
				<div>  The players may simply agree to a draw and stop playing</div></li>
    <li>
				<div>There are not enough pieces on the board to force a checkmate (example: a king and a bishop vs.a king)</div></li>
  <li>
				<div>  A player declares a draw if the same exact position is repeated three times (though not necessarily three times in a row)</div></li>
   <li>
				<div> Fifty consecutive moves have been played where neither player has moved a pawn or captured a piece.</div></li>
   </ul>
<br />
    <p>
     <h3 >Some Tournament Rules</h3>
     <p>

Many tournaments follow a set of common, similar rules. These rules do not necessarily apply to play at home or online. 
	<p>
	<strong> Touch-move</strong>
	<p>

If a player touches one of their own pieces they must move that piece as long as it is a legal move. If a player touches an opponent's piece, they must capture that piece. A player who wishes to touch a piece only to adjust it on the board must first announce the intention, usually by saying "adjust". 	
		
		<p>
		
		<strong> Introduction to Clocks and Timers</strong>
		<p>

Most tournaments use timers to regulate the time spent on each game, not on each move. Each player gets the same amount of time to use for their entire game and can decide how to spend that time. Once a player makes a move they then touch a button or hit a lever to start the opponent's clock. If a player runs out of time and the opponent calls the time, then the player who ran out of time loses the game (unless the opponent does not have enough pieces to checkmate, in which case it is a draw). 
     		<p>
     		 <h3>Basic Strategy</h3>
     		 <p>

There are four simple things that every chess player should know: 
<p>
 <strong>#1 Protect your king</strong><p>

Get your king to the corner of the board where he is usually safer. Don't put off castling. You should usually castle as quickly as possible. Remember, it doesn't matter how close you are to checkmating your opponent if your own king is checkmated first!
<p>

<strong> #2 Don't give pieces away</strong><p>

Don't carelessly lose your pieces! Each piece is valuable and you can't win a game without pieces to checkmate. There is an easy system that most players use to keep track of the relative value of each chess piece:
<p>

<ul class="list-1">
	
			<li>
				<div>
    A pawn is worth 1</div></li>
   <li>
				<div> A knight is worth 3</div></li>
  <li>
				<div>  A bishop is worth 3</div></li>
  <li>
				<div>  A rook is worth 5</div></li>
  <li>
				<div>  A queen is worth 9</div></li>
 <li>
				<div>   The king is infinitely valuable</div></li>
				
 </ul>
 <p>
 At the end of the game these points don't mean anything - it is simply a system you can use to make decisions while playing, helping you know when to capture, exchange, or make other moves. 
 <p>
 
 <strong> #3 Control the center</strong><p>

You should try and control the center of the board with your pieces and pawns. If you control the center, you will have more room to move your pieces and will make it harder for your opponent to find good squares for his pieces. In the example above white makes good moves to control the center while black plays bad moves.
<p>
<strong>#4 Use all of your pieces</strong><p>

In the example above white got all of his pieces in the game! Your pieces don't do any good when they are sitting back on the first row. Try and develop all of your pieces so that you have more to use when you attack the king. Using one or two pieces to attack will not work against any decent opponent.
<p>
 
  <h3>  Getting Better at Chess </h3><p>

Knowing the rules and basic strategies is only the beginning - there is so much to learn in chess that you can never learn it all in a lifetime! To improve you need to do three things:
<p>
<strong>#1 - Play</strong><p>

Just keep playing! Play as much as possible. You should learn from each game - those you win and those you lose.
<p>
<strong>#2 - Study</strong>
<p>
If you really want to improve quickly then pick up a [recommended chess book]. There are also many resources on Chess.com to help you study and improve.
<p>
<strong>#3 - Have fun</strong><p>

Don't get discouraged if you don't win all of your games right away. Everyone loses - even world champions. As long as you continue to have fun and learn from the games you lose then you can enjoy chess forever!
<p>   		
     		</div>
		</div>
		</div>
		<jsp:include page="footer.jsp" />
		
</div>
</body>
</html>