<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="css/style_uhome.css" />
<!-- modernizr enables HTML5 elements and feature detects -->
<script type="text/javascript" src="js/modernizr-1.5.min.js"></script>

<!--  Carousel -----   from consulting website --- -->
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/jquery.featureCarousel.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#carousel").featureCarousel({
			autoPlay : 7000,
			trackerIndividual : false,
			trackerSummation : false,
			topPadding : 50,
			smallFeatureWidth : .9,
			smallFeatureHeight : .9,
			sidePadding : 0,
			smallFeatureOffset : 0
		});
	});
</script>
<style type="text/css">
<!--
.style2 {
	color: #FFFF00
}
-->
</style>






<style type="text/css">
<!--
.style16 {
	font-size: medium
}

.style17 {
	font-size: small
}

.style18 {
	color: #48678C
}

.style19 {color: #000000}
.style222 {color: #FFF}
-->
</style>
</head>



<!-- javascript at the bottom for fast page loading -->
<!-- <script type="text/javascript" src="js/jquery.js"></script> -->
<script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
<script type="text/javascript" src="js/jquery.sooperfish.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('ul.sf-menu').sooperfish();
	});
</script>


<script type="text/javascript">
	Cufon.now();
</script>
<script type="text/javascript">
	$(window).load(function() {
		$('.slider')._TMS({
			duration : 1000,
			easing : 'easeOutQuint',
			preset : 'slideDown',
			slideshow : 7000,
			banners : false,
			pauseOnHover : true,
			pagination : true,
			pagNums : false
		});
	});
</script>
