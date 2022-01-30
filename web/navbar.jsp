<%-- 
    Document   : navbar
    Created on : 28-Jan-2022, 8:54:52 pm
    Author     : Apu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="viewport" content="width=device-width" initial scale=1>
        <title>Indian Taste</title>
        <link rel="icon" type="images/favicon" href="images/favicon.ico" />
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        
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
                                <a class="nav-link" href="index">HOME
                                    <span class="sr-only">(current)</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about-us.html">ABOUT US</a>
                            </li>
                            <li class="nav-item">
                                <a href="#">Wishlist</a>
                            </li>
                            <li class="nav-item">
                                <li><a href="#">Cart</a></li>
                            </li>
                            <li class="nav-item">
                                <a href="profile">Profile</a>
                            </li>
                            
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        
      
        
    </body>
</html>
