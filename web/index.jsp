<%-- 
    Document   : index
    Created on : 27-Jan-2022, 10:23:58 pm
    Author     : Apu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="viewport" content="width=device-width" initial scale=1>
        <title>Indian Taste</title>
        <!--favicon-->
        <link rel="icon" type="images/favicon" href="images/favicon.ico" />
        <!--google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Cookie|Lato:100,300,400,700,900|ZCOOL+XiaoWei&display=swap" rel="stylesheet" />
        <!--bootstrap css-->
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
        <!--owlcarousel css-->
        <link rel="stylesheet" type="text/css" href="plugins/owlcarousel/css/owl.carousel.min.css" />
        <!--fancybox css-->
        <link rel="stylesheet" type="text/css" href="plugins/fancybox/css/jquery.fancybox.min.css" />
        <!--style css-->
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <!--js start-->
        <script src="js/jquery.js" type="text/javascript"></script>
        <!--bootstrap js-->
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <!--owlcarousel js-->
        <script src="plugins/owlcarousel/js/owl.carousel.min.js" type="text/javascript"></script>
        <!--fancybox js-->
        <script src="plugins/fancybox/js/jquery.fancybox.min.js" type="text/javascript"></script>
        <!--custom js-->
        <script src="js/custom.js" type="text/javascript"></script>

    </head>

    <body>

        <header class="site-header">
            
            <nav class="navbar navbar-expand-lg navbar-dark">
                <div class="container">
                    <a class="navbar-brand" href="#"><img src="images/logo.png" alt="Logo" /></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarResponsive">
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.html">HOME
                                    <span class="sr-only">(current)</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about-us.html">ABOUT US</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="menu.html">MENU</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="gallery.html">GALLERY</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="contact.html">CONTACT US</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="login.jsp">LOGIN</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <section class="home-banner">
            <div id="demo" class="carousel slide" data-ride="carousel">

                <!-- The slideshow -->
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="images/slider-1.jpg" alt="#">

                        <div class="carousel-caption">
                            <a href="showRestaurants" > <button  class="btn btn-subscribe">Book Your Table</button></a>
                            <h2>Best Restaurant with best foods</h2>
                            <h1>The heart of every inidian</h1>
                            <div class="row">
                                <div class="col-md-6 offset-md-3">
                                    <form>
                                        <div class="input-group">
                                            <input class="form-control fill" type="email" placeholder="Your Restaurant :">
                                            <span class="input-group-btn">
                                                <button type="submit" class="btn btn-subscribe">Search</button>
                                            </span>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        
        

        

        <section class="feature-sec text-center">
            <div class="container">
                <div class="heading">
                    <h2>What we <span class="glod">Provide</span></h2>
                    <hr class="border" />
                    <p>Enjoing great food and wine is two of life’s great pleasures!</p>
                </div>
                <div class="row">
                    <div class="col-md-3">
                        <div class="feature">
                            <div class="feature-icon">
                                <img src="images/icon/covered-food-tray-on-a-hand-of-hotel-room-service.svg" alt="icon" />
                            </div>
                            <h3>Quality Foods</h3>
                            <hr class="feature-border" />
                            <p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer</p>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="feature">
                            <div class="feature-icon">
                                <img src="images/icon/logistics-delivery-truck-in-movement.svg" alt="icon" />
                            </div>
                            <h3>Fast Delievery</h3>
                            <hr class="feature-border" />
                            <p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer</p>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="feature">
                            <div class="feature-icon">
                                <img src="images/icon/recipes-book-with-spaghetti-plate-on-the-cover.svg" alt="icon" />
                            </div>
                            <h3>Fresh Recipes</h3>
                            <hr class="feature-border" />
                            <p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer</p>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="feature">
                            <div class="feature-icon">
                                <img src="images/icon/harvest.svg" alt="icon" />
                            </div>
                            <h3>Fresh Ingredients</h3>
                            <hr class="feature-border" />
                            <p>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer</p>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </section>

<!--        <section class="map">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14736.579688467782!2d88.42867225281928!3d22.57368245225205!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a02751abe86f219%3A0xefc5f1fa81ea5c2e!2sVaahjee%20Pure%20Veg!5e0!3m2!1sen!2sin!4v1570773002155!5m2!1sen!2sin" width="100%" height="350" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
        </section>-->
        
        <section class="sec text-center">
            <div class="container">
                <div class="heading">
                    <h2>Meet Our<span class="glod"> Team</span></h2>
                    <hr class="border" />
                </div>
                <div class="row">
                    <div class="col-md-6 col-lg-3">
                        <div class="team">
                            <div class="member-picture">
                                <img src="images/team-1.jpg" alt="#" />
                                <div class="member-overlay">
                                    <ul class="member-icon">
                                        <li><a href=""><img src="images/icon/facebook-logo-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/twitter-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/linkedin-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/instagram-circle.svg" alt="icon" /></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="member-details">
                                <h4>Henry Nichols</h4>
                                <p>General Manager</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <div class="team">
                            <div class="member-picture">
                                <img src="images/team-2.jpg" alt="#" />
                                <div class="member-overlay">
                                    <ul class="member-icon">
                                        <li><a href=""><img src="images/icon/facebook-logo-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/twitter-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/linkedin-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/instagram-circle.svg" alt="icon" /></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="member-details">
                                <h4>Arnold Russel</h4>
                                <p>Chief Instructor</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <div class="team">
                            <div class="member-picture">
                                <img src="images/team-3.jpg" alt="#" />
                                <div class="member-overlay">
                                    <ul class="member-icon">
                                        <li><a href=""><img src="images/icon/facebook-logo-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/twitter-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/linkedin-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/instagram-circle.svg" alt="icon" /></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="member-details">
                                <h4>Ronald Arone</h4>
                                <p>General Manager</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <div class="team">
                            <div class="member-picture">
                                <img src="images/team-4.jpg" alt="#" />
                                <div class="member-overlay">
                                    <ul class="member-icon">
                                        <li><a href=""><img src="images/icon/facebook-logo-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/twitter-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/linkedin-circle.svg" alt="icon" /></a></li>
                                        <li><a href=""><img src="images/icon/instagram-circle.svg" alt="icon" /></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="member-details">
                                <h4>Orem Owlz</h4>
                                <p>Chief Chef</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </section>
        
        <footer class="footer-bg text-center" style="background-image: url(images/footer-bg.jpg)" ;>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="footer-content">
                            <div class="footer-logo">
                                <a href="#"><img src="images/footer-logo.png" alt="logo" /></a>
                            </div>
                            <ul class="footer-nav">
                                <li><a href="index.html">HOME</a></li>
                                <li><a href="about-us.html">ABOUT US</a></li>
                                <li><a href="menu.html">MENU</a></li>
                                <li><a href="gallery.html">GALLERY</a></li>
                                <li><a href="contact.html">CONTACT US</a></li>
                            </ul>
                            <ul class="footer-icon">
                                <li><a href="#"><img src="images/icon/facebook-logo.svg" alt="icon" /></a></li>
                                <li><a href="#"><img src="images/icon/instagram-social-network-logo-of-photo-camera.svg" alt="icon" /></a></li>
                                <li><a href="#"><img src="images/icon/twitter.svg" alt="icon" /></a></li>
                                <li><a href="#"><img src="images/icon/linkedin-letters.svg" alt="icon" /></a></li>
                            </ul>
                            <ul class="copyright">
                                <li><span class="right">&copy;</span>Copyright 2022</li>
                                <li><a href="#" class="glod">indiantaste.com</a></li>
                                <li>All rights reserved</li>
                            </ul>
                            <p>Powered by - <span class="glod">Group G Exavalu</span></p>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </footer>

    </body>

</html>

