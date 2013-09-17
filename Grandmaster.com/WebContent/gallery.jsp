<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<head>
<title>Gallery</title>
<jsp:include page="dependencies.jsp" />

<link rel="stylesheet" href="css/style-gallery.css" type="text/css" media="screen">
    
    <script src="js/jquery-1.6.2.min.js" type="text/javascript"></script>  
    <script src="js/jquery.galleriffic.js" type="text/javascript"></script> 
    <script src="js/jquery.opacityrollover.js" type="text/javascript"></script>
    
  <style type="text/css">
<!--
.style2 {
	color: #FFFF00
}

.style4 {
	color: #FFFFFF
}

.style15 {
	color: #000
}
-->
</style>

</head>
<body>
<div id="main">
		<header>
			<jsp:include page="mainMenu.jsp" />
		</header>
		

	
		                <div class="row-bot">
        	       <div class="row-bot-bg">
					    
                            <div class="gallery p3">
                            	<div class="wrapper indent-bot">
                                    <div id="gallery" class="content">
                                       <div class="wrapper">
                                           <div class="slideshow-container">
                                                <div id="slideshow" class="slideshow"></div>
                                           </div>
                                       </div>
                                     </div>
                                     <div id="thumbs" class="navigation">
                                        <ul class="thumbs noscript">
                                            <li>
                                                <a class="thumb" href="images/gallery1.jpg" title=""> <img src="images/thumb1.jpg" alt="" /><span></span> </a>                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery2.jpg" title=""> <img src="images/thumb2.gif" alt="" /> <span></span></a>                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery3.jpg" title=""> <img src="images/thumb3.jpg" alt="" /> <span></span></a>                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery4.jpg" title=""> <img src="images/thumb4.jpg" alt="" /> <span></span></a>                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery5.jpg" title=""> <img src="images/thumb5.jpg" alt="" /> <span></span></a>                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/galley6.jpg" title=""> <img src="images/thumb6.jpg" alt="" /> <span></span></a>                                            </li>           
                                        </ul>
                                    </div>
                                </div>
                                <div class="inner">
                                    <div class="wrapper">
                                        <span class="title img-indent3">HELLO!</span>
                                        <div class="extra-wrap indent-top2">
                                       <span class="style15">It's never to late to learn how to play chess - the most popular game in   the world! If you are totally new to the game or even want to learn all   of the rules and strategies, read on!   </span>                                     </div>
                                    </div>
                                </div>
                            </div>
                            <div class="container_12"></div>
                          
						
					</div>
					</div>
</div>
	

<br />
<div>
<p>
<p>
<br />
</div>
	<jsp:include page="footer.jsp" />
	
	<script type="text/javascript">
			$(window).load(function() {
			// We only want these styles applied when javascript is enabled
			$('div.navigation').css({'width' : '320px', 'float' : 'right'});
			$('div.content').css('display', 'block');
	
			// Initially set opacity on thumbs and add
			// additional styling for hover effect on thumbs
			var onMouseOutOpacity = 0.5;
			$('#thumbs ul.thumbs li span').opacityrollover({
				mouseOutOpacity:   onMouseOutOpacity,
				mouseOverOpacity:  0.0,
				fadeSpeed:         'fast',
				exemptionSelector: '.selected'
			});
			
			// Initialize Advanced Galleriffic Gallery
			var gallery = $('#thumbs').galleriffic({
				delay:                     7000,
				numThumbs:                 12,
				preloadAhead:              6,
				enableTopPager:            false,
				enableBottomPager:         false,
				imageContainerSel:         '#slideshow',
				controlsContainerSel:      '',
				captionContainerSel:       '',
				loadingContainerSel:       '',
				renderSSControls:          true,
				renderNavControls:         true,
				playLinkText:              'Play Slideshow',
				pauseLinkText:             'Pause Slideshow',
				prevLinkText:              'Prev',
				nextLinkText:              'Next',
				nextPageLinkText:          'Next',
				prevPageLinkText:          'Prev',
				enableHistory:             true,
				autoStart:                 7000,
				syncTransitions:           true,
				defaultTransitionDuration: 900,
				onSlideChange:             function(prevIndex, nextIndex) {
					// 'this' refers to the gallery, which is an extension of $('#thumbs')
					this.find('ul.thumbs li span')
						.css({opacity:0.5})
				},
				onPageTransitionOut:       function(callback) {
					this.find('ul.thumbs li span').css({display:'block'});
				},
				onPageTransitionIn:        function() {
					this.find('ul.thumbs li span').css({display:'none'});
				}
			});
		});
	</script>
	
</body>
