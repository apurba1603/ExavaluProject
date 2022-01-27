<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Reserve Your Table</title>
        <link rel="stylesheet" type="text/css" href="css/showRestaurants.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700,800,900&display=swap" rel="stylesheet">
    </head> 
    <body>   
        <header class="header">
            <div class="container">
                <div class="logo">
                    <a href="#"><img src="images/logo.png" width="300" alt="logo"/></a>
                </div>

                <div class="icon">
                    <ul>
                        <li><a href="#"><img src="images/icon/profile.svg" width="15" alt="icon"><br/>Profile</a></li>
                        <li><a href="#"><img src="images/icon/list.svg" width="15" alt="icon"><br/>Wishlist</a></li>
                        <li><a href="#"><img src="images/icon/shopping_cart.png" width="15" alt="icon"><br/>cart</a></li>
                    </ul>
                </div>
            </div>
        </header>

        <section class="section">
            <div class="container">
                <div class="head-text">
                    <h1>Choose your favourite Restaurant</h1>
                </div>
                <div class="sec-wrap">
                    <s:if test="noData==false">
                        <s:iterator value="restaurantList">
                            <div class="sec">
                                <div class="picture">
                                    <img src="images/photo1.jfif" alt="#"/>

                                </div>
                                <div class="sec-btn">
                                    <button class="btn1">Reserve</button>
                                    <button class="btn2">WISHLIST</button>
                                </div>
                                <div class="sec-text">
                                    <h4><s:property value="restaurantName" /></h4>
                                    <p><s:property value="location" /></p>
                                    <p><s:property value="timings" /> </p>
                                    <p>Approx Cost : <s:property value="approxCost" /></p>
                                </div>
                            </div>
                        </s:iterator>
                    </s:if>
                    <s:else>
                        <div style="color: red;">No Data Found.</div>
                    </s:else>

                </div>
            </div>
        </section>

    </body>
</html>