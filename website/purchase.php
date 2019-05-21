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
	<li><a href="donation.php" >Purchase Tickets</a></li>
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
<div class="visual-area">
			<div class="container">
				<h2>Pricing Plans</h2>
				<div class="pricing-tables">
					<div class="plan recommended">
		                <div class="head">
		                    <h3>Six Flags</h3>
		                </div>
		                <div class="price">
		                    <span class="price-main"><span class="symbol">$</span>59.99</span>
		                    <span class="price-additional">Discounts may apply</span>
		                </div>
		                <form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
                        <input type="hidden" name="cmd" value="_s-xclick">
                        <input type="hidden" name="hosted_button_id" value="QENEVVAFFE9EA">
                            <table>
                        <tr><td><input type="hidden" name="on0" value="Ticket Price">Ticket Price</td></tr><tr><td><select name="os0">
                    	<option value="Children">Children $39.99 USD</option>
	                    <option value="Adult">Adult $59.99 USD</option>
	                    <option value="Senior">Senior $39.99 USD</option>
                        </select> </td></tr>
                        </table>
                        <input type="hidden" name="currency_code" value="USD">
                        <input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
                        <img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
                        </form>
		            </div>
		            <div class="plan recommended">
		                <div class="head">
		                    <h3>Jolly Roger</h3> </div>
		                <div class="price">
		                    <span class="price-main"><span class="symbol">$</span>49.99</span>
		                    <span class="price-additional">Discounts may apply</span>
		                </div>
		                <form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="KB2RNWYHWXKEE">
<table>
<tr><td><input type="hidden" name="on0" value="Ticket Price">Ticket Price</td></tr><tr><td><select name="os0">
	<option value="Children">Children $39.99 USD</option>
	<option value="Adult">Adult $49.99 USD</option>
	<option value="Senior">Senior $39.99 USD</option>
</select> </td></tr>
</table>
<input type="hidden" name="currency_code" value="USD">
<input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
</form>

		            </div>
		            <div class="plan recommended">
		                <div class="head">
		                    <h3>Adventure Park</h3> </div>
		                <div class="price">
		                    <span class="price-main"><span class="symbol">$</span>59.99</span>
		                    <span class="price-additional">Discounts may apply</span>
		                </div>
		                <form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="QENEVVAFFE9EA">
<table>
<tr><td><input type="hidden" name="on0" value="Ticket Price">Ticket Price</td></tr><tr><td><select name="os0">
	<option value="Children">Children $39.99 USD</option>
	<option value="Adult">Adult $59.99 USD</option>
	<option value="Senior">Senior $39.99 USD</option>
</select> </td></tr>
</table>
<input type="hidden" name="currency_code" value="USD">
<input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
</form>
		            </div>
				</div>
 			</div>
<section class="area">
<form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="QENEVVAFFE9EA">
<table>
<tr><td><input type="hidden" name="on0" value="Ticket Price">Ticket Price</td></tr><tr><td><select name="os0">
	<option value="Children">Children $39.99 USD</option>
	<option value="Adult">Adult $59.99 USD</option>
	<option value="Senior">Senior $39.99 USD</option>
</select> </td></tr>
</table>
<input type="hidden" name="currency_code" value="USD">
<input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
</form>

</section>
</html>