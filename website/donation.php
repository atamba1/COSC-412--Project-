<?php 
  session_start(); 

  if (!isset($_SESSION['username'])) {
  	$_SESSION['msg'] = "You must log in first";
  	header('location: login.php');
  }
  if (isset($_GET['logout'])) {
  	session_destroy();
  	unset($_SESSION['username']);
  	header("location: login.php");
  }
?>
<!DOCTYPE html>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"><meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Park Website</title>
	<meta name="description" content="Group 6 Semester project"><meta name="author" content="Group 6">
	<link href="favicons/logo.png" rel="icon" sizes="16x16" type="image/png" />
	<link href="css/bootstrap.css" rel="stylesheet" />
	<link href="fonts/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" />
	<link href="css/all.css" rel="stylesheet" />
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700|Source+Sans+Pro:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
</head>
<body>


<div id="wrapper">
<header id="header">
<div class="container">
<div class="logo"><a href="#"><img alt="Parks" src="images/logo.png" /></a></div>

<nav id="nav">
<div class="opener-holder"></div>
<a class="btn btn-primary rounded" href="signin.html">Sign In</a>

<div class="nav-drop">
<ul>
	<li class="active visible-sm visible-xs"><a href="#">Home</a></li>
	<li><a href="index.php">Home</a></li>
	<li><a href="about_us.html">About Us</a></li>
	<li><a href="purchase.php" >Purchase Tickets</a></li>
	<li><a href="launch.html">Play Game</a></li>
</ul>

<div class="drop-holder visible-sm visible-xs"><span>Follow Us</span>

<ul class="social-networks">
	<li></li>
	<li></li>
</ul>
</div>
</div>
</nav>
</div>
</header>

<section class="visual">
<div class="container">
<div class="text-block">
<div class="heading-holder">
<h1>Maryland Parks Association</h1>
</div>

<p class="tagline"></p>
<span class="info">--------FICTIONAL SCHOOL PROJECT--------</span></div>
</div>
<img alt="" class="bg-stretch" src="images/img-bg-02.jpg" /></section>
<section class="area">
<div class="container">
<div class="row">
<div class="col-md-5">
<ul class="visual-list">
	<li>
	<div class="img-holder"><img alt="" src="images/donate.png" width="110" /></div>

	<div class="text-holder">
	<h3>Why donate?</h3>

	<p>Our organization uses the support of the families who pledge money towards supporting safe, healthy fun and learning. The more money we recieve, the more services and games we can provide you! So please donate today</p>
	</div>
	</li>
	<li>
	
	<div class="text-holder">
	<h3>MPA</h3>

	<p>Our organization exists to encourage the youth to enjoy the outdoors, while continuing to grow educationally through the use of educational applications. We make the process of finding tickets for your favorite parks simple, creating a one-stop location for all your park needs.</p>
	</div>
	</li>

</ul>
</div>

<div class="col-md-7">
<script src="https://donorbox.org/widget.js" paypalExpress="false"></script><iframe src="https://donorbox.org/embed/support-our-organization-fiction-2" height="685px" width="120%" style="max-width:500px; min-width:310px; max-height:none!important" seamless="seamless" name="donorbox" frameborder="0" scrolling="no" allowpaymentrequest></iframe>
</div>
</section>
</html>