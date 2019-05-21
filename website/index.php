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
<a class="btn btn-primary rounded" href="login.php">Sign In</a>

<div class="nav-drop">
<ul>
	<li class="active visible-sm visible-xs"><a href="#">Home</a></li>
	<li><a href="purchase.php">Purchase Tickets</a></li>
	<li><a href="about_us.html">About Us</a></li>
	<li><script src="https://donorbox.org/install-popup-button.js" type="text/javascript" defer></script>
<a class="dbox-donation-button" href="donation.php" >Donation</a></li>
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

<section class="main">
<div class="container">
<div id="cta"><a class="btn btn-primary rounded" href="register.php">Sign Up</a>

<p>Purchasing is powered and secured by PayPal for safe transactions</p>
</div>

<div class="row">
<div class="text-box col-md-offset-1 col-md-10">
<h2>About our Partners</h2>

<p>This effort to promote safe, healthy fun to our younger generation is powered by both the federal Department of Education and the Maryland Board of Education, as well as these partners.</p>
</div>
</div>
</div>
</section>

<section class="area">
<div class="container">
<div class="row">
<div class="col-md-5">
<ul class="visual-list">
	<li>
	<div class="img-holder"><img alt="" src="images/sixflags.png" width="110" /></div>

	<div class="text-holder">
	<h3>Six Flags</h3>

	<p>Six Flags Entertainment Corporation, also known as Six Flags Theme Parks or simply Six Flags, is an amusement park corporation based in the United States, with properties in the US, Canada, and Mexico.</p>
	</div>
	</li>
	<li>
	<div class="img-holder"><img alt="" src="images/jollyroger.png" width="110" /></div>

	<div class="text-holder">
	<h3>Jolly Roger</h3>

	<p>Jolly Roger Amusement Park is an amusement park located in Ocean City, Maryland. The park features two locations in Ocean City: one at the pier, and one further uptown at 30th Street.</p>
	</div>
	</li>
	<li>
	<div class="img-holder"><img alt="" src="images/adventure.png" width="110" /></div>

	<div class="text-holder">
	<h3>Adventure Park</h3>

	<p>Adventure Park USA is a small theme park in Monrovia, Maryland, east of Frederick, Maryland, which opened in 2005. The "Wild Cat" roller coaster came from Williams Grove Amusement Park in Pennsylvania.</p>
	</div>
	</li>
</ul>
</div>

<div class="col-md-7">
<div class="slide-holder">
<div class="mapouter">
<div class="gmap_canvas"><iframe frameborder="0" height="500" id="gmap_canvas" marginheight="0" marginwidth="0" scrolling="no" src="https://maps.google.com/maps?q=13710%20Central%20Ave%2C%20Bowie%2C%20MD%2020721&amp;t=k&amp;z=19&amp;ie=UTF8&amp;iwloc=&amp;output=embed" width="600"></iframe>Werbung: <a href="https://www.pureblack.de">pureblack.de</a></div>
<style type="text/css">.mapouter{position:relative;text-align:right;height:500px;width:600px;}.gmap_canvas {overflow:hidden;background:none!important;height:500px;width:600px;}
</style>
</div>
</div>
</div>
</div>
</div>
</section>

<section class="visual-container">
<div class="visual-area">
<div class="container">
<h2>Our Initiatives</h2>

<ul class="testimonials">
	<li>
	<div class="img-holder"><a href="#"><img alt="" height="100" src="images/download.jpg" width="100" /></a></div>

	<p><em>Reinforcing skills and lessons learned in school to better cement knowledge in a fun and enjoyable way.</em></p>
	</li>
	<li>
	<div class="img-holder"><a href="#"><img alt="" height="100" src="images/download.jpg" width="100" /></a></div>

	<p><em>Promoting safe fun to our students </em></p>
	</li>
	<li>
	<div class="img-holder"><a href="#"><img alt="" height="100" src="images/download.jpg" width="100" /></a></div>

	<p><em>Encouraging the youth to go outside. Just go outside. </em></p>
	</li>
	<li>
	<div class="img-holder"><a href="#"><img alt="" height="100" src="images/download.jpg" width="100" /></a></div>

	<p><em>another thing</em></p>
	</li>
</ul>
</div>
</div>

<div class="visual-area">
<div class="container"></div>
</div>
</section>

<section class="main-zero-padd"><img alt="" src="images/video-placeholder.jpg" style="max-width:100%;" /></section>

<section class="area">
<div class="container">
<div class="subscribe">
<h3>Subscribe to Our Newsletter</h3>

<form class="form-inline"><button class="btn btn-primary rounded" type="submit">Subscribe</button>

<div class="form-group"><input class="form-control rounded" id="exampleInputEmail2" placeholder="Email..." type="email" /></div>
</form>
</div>
</div>
</section>

<footer id="footer">
<div class="container">
<div class="footer-holder">
<div class="row  text-center">
<div class="col-md-12"><a href="#"><img alt="helpme" src="images/doe.png" /></a></div>
</div>

<div class="row">
<div class="cta-footer" id="cta"><a class="btn btn-primary rounded" href=launch.html>Play Game</a></div>
</div>

<div class="row">
<div class="col-md-6">
<h3>Email Us for more information</h3>

<p><a href="mailto:parks@mailinator.com">parks@mailinator.com</a></p>
</div>

<div class="col-md-6 text-right">
<ul class="social">
	<li></li>
	<li></li>
</ul>
</div>
</div>
</div>
</div>
</footer>
</div>
<div class="content">
  	<!-- notification message -->
  	<?php if (isset($_SESSION['success'])) : ?>
      <div class="error success" >
      	<h3>
          <?php 
          	echo $_SESSION['success']; 
          	unset($_SESSION['success']);
          ?>
      	</h3>
      </div>
  	<?php endif ?>

    <!-- logged in user information -->
    <?php  if (isset($_SESSION['username'])) : ?>
    	<p>Welcome <strong><?php echo $_SESSION['username']; ?></strong></p>
    	<p> <a href="index.php?logout='1'" style="color: red;">logout</a> </p>
    <?php endif ?>
</div>
<script src="js/jquery-1.11.2.min.js"></script><script src="js/bootstrap.js"></script><script src="js/jquery.main.js"></script></body>
</html>