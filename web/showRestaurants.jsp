<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="navbar.jsp" ></jsp:include>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Reserve Your Table</title>
        <link rel="stylesheet" type="text/css" href="css/showRestaurants.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700,800,900&display=swap" rel="stylesheet">
    </head> 
    <body>   
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
                                    <a href="bookTable.action?restaurantId=<s:property value="restaurantId"/>" ><button class="btn1">Book a table</button> </a>
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