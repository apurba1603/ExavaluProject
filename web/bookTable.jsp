<%-- 
    Document   : restaurant.jsp
    Created on : 29-Jan-2022, 12:52:21 am
    Author     : Apu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="navbar.jsp" ></jsp:include>
<%
    if (request.getSession().getAttribute("User") == null) {
        String errorMsg = "You are not logged in. Please login first!!";
        request.setAttribute("ErrorMsg", errorMsg);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Men | t-shirt</title>
        <link rel="stylesheet" type="text/css" href="css/restaurant.css">
        <link rel="shortcut icon" type="favicon" href="images/favicon.ico">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700,800,900&display=swap" rel="stylesheet">
    </head>

    <body>


        <section class="section">
            <div class="container">

                <div class="grid-wrap">
                    <div class="grid">
                        <div class="model-picture">
                            <img src="images/restaurant.jpg" alt="#"/>
                        </div>
                    </div>
                    <div class="grid">
                        <div class="model-picture">
                            <img src="images/restaurant.jpg" alt="#"/>

                        </div>
                    </div>

                </div>

                <div class="box-wrap">
                    <div class="box-text">
                        <h1><s:property value="restaurantName" /></h1>
                        <h2><s:property value="location" /></h2>
                        <hr class="border"/>
                        <p><strong>Timings : <s:property value="timings" /></p>
                        <p>Approx. Cost : <s:property value="approxCost" /></p>
                    </div>



                    <div class="box-btn">
                        <button class="a">Add Your Menu 
                        </button>
                        <a href="reservation.action?submitType=openForm&restaurantId=<s:property value="restaurantId"/>"><button class="b">Reserve Table
                            </button></a>
                    </div>
                </div>  
            </div>
        </section>

    </body>
</html>
