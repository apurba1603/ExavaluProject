<%-- 
    Document   : userProfile
    Created on : 28-Jan-2022, 8:14:29 pm
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
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Profile</title>

        <meta name="author" content="Codeconvey" />
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet"><link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css'>

        <!--Only for demo purpose - no need to add.-->
        <link rel="stylesheet" href="css/demo.css" />

        <link rel="stylesheet" href="css/profile.css">
    </head>
    <body>

        <div class="ScriptTop">
            <div class="rt-container">
                <div class="col-rt-4" id="float-right">

                    <!-- Ad Here -->

                </div>
            </div>
        </div>

        <!--<header class="ScriptHeader">
            <div class="rt-container">
                <div class="col-rt-12">
                        <div class="rt-heading">
                        <h1>Customer</h1>
                        <p></p>
                    </div>
                </div>
            </div>
        </header>-->

        <section>
            <div class="rt-container">
                <div class="col-rt-12">
                    <div class="Scriptcontent">

                        <!-- Student Profile -->
                        <div class="student-profile py-4">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-4">
                                        <div class="card shadow-sm">
                                            <div class="card-header bg-transparent text-center">
                                                <img class="profile_img" src="images/profile.jfif" alt="student dp">
                                                <h3><s:property value="firstName" /> <s:property value="lastName" /></h3>
                                            </div>
                                            <div class="card-body">
                                                <p class="mb-0"><strong class="pr-1">Email Id:</strong><s:property value="email" /></p>
                                                <p class="mb-0"><strong class="pr-1">Contact no.</strong><s:property value="phoneNumber" /></p>
                                            </div>
                                            <div class="btn">
                                                <ul>
                                                    <li>
                                                        <div class="btn" >
                                                            <a href="showRestaurants" > <button  class="btn btn-subscribe">Update Profile</button></a>
                                                        </div>
                                                    </li>
                                                    <li>
                                                        <div class="btn" >
                                                            <a href="logout" > <button  class="btn btn-subscribe">Logout</button></a>
                                                        </div>
                                                    </li>

                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-8">
                                        <div class="card shadow-sm">
                                            <div class="card-header bg-transparent border-0">
                                                <h3 class="mb-0"><i class="far fa-clone pr-1"></i>General Information</h3>
                                            </div>
                                            <div class="card-body pt-0">
                                                <table class="table table-bordered">
                                                    <tr>
                                                        <th width="30%">Roll</th>
                                                        <td width="2%">:</td>
                                                        <td>125</td>
                                                    </tr>
                                                    <tr>
                                                        <th width="30%">Academic Year	</th>
                                                        <td width="2%">:</td>
                                                        <td>2020</td>
                                                    </tr>
                                                    <tr>
                                                        <th width="30%">Gender</th>
                                                        <td width="2%">:</td>
                                                        <td>Male</td>
                                                    </tr>
                                                    <tr>
                                                        <th width="30%">Religion</th>
                                                        <td width="2%">:</td>
                                                        <td>Group</td>
                                                    </tr>
                                                    <tr>
                                                        <th width="30%">blood</th>
                                                        <td width="2%">:</td>
                                                        <td>B+</td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                        <div style="height: 26px"></div>
                                        <div class="card shadow-sm">
                                            <div class="card-header bg-transparent border-0">
                                                <h3 class="mb-0"><i class="far fa-clone pr-1"></i>Your Bookings</h3>
                                            </div>
                                            <div class="card-body pt-0">
                                                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">

                                                    <h2>User</h2>
                                                    <font style="color: #a52834"><c:out value="${requestScope.MSG}"></c:out></font>
                                                    <div class="table-responsive">
                                                        <s:if test="noData==false">
                                                            <table class="table table-striped table-sm">
                                                                <thead>
                                                                    <tr>
                                                                        <th scope="col">User Name</th>
                                                                        <th scope="col">Password</th>
                                                                        <th scope="col">First Name</th>
                                                                        <th scope="col">Last Name</th>
                                                                        <th scope="col">Email</th>
                                                                        <th scope="col">Phone Number</th>
                                                                        <th scope="col">Actions</th>
                                                                    </tr>
                                                                </thead>
                                                                <s:iterator value="userList">
                                                                    <tr>
                                                                        <td><s:property value="userName" /></td>
                                                                        <td><s:property value="password" /></td>
                                                                        <td><s:property value="firstName" /></td>
                                                                        <td><s:property value="lastName" /></td>
                                                                        <td><s:property value="email" /></td>
                                                                        <td><s:property value="phoneNumber" /></td>
                                                                        <td>
                                                                            <a href="updatedetails.action?submitType=updatedata&userName=<s:property value="userName"/>">
                                                                                <button class="button-update">Update</button>
                                                                            </a>
                                                                            <a href="deleterecord.action?userName=<s:property value="userName"/>">
                                                                                <button class="button-delete">Delete</button>
                                                                            </a>
                                                                        </td>
                                                                    </tr>
                                                                </s:iterator>
                                                            </table>
                                                        </s:if>
                                                        <s:else>
                                                            <div style="color: red;">No Data Found.</div>
                                                        </s:else>
                                                    </div>
                                                </main>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- partial -->

                    </div>
                </div>
            </div>
        </section>






        <!-- Analytics -->

    </body>
</html>
