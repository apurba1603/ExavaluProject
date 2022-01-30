<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="css/login.css">
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="main">
            <input type="checkbox" id="chk" aria-hidden="true">



            <div class="signup">
                <form action="registerUser" method="post">
                    <label for="chk" aria-hidden="true">Register User</label>
                    <span style="color: red;"><c:out value="${requestScope.MSG}"></c:out></span>
                    <input type="text" name="userName" placeholder="User name" required="">
                    <input type="password" name="password" placeholder="Password" required="">
                    <input type="text" name="firstName" placeholder="FirstName" required="">
                    <input type="text" name="lastName" placeholder="LastName" required="">
                    <input type="email" name="email" placeholder="Email" required="">
                    <input type="text" name="phoneNumber" placeholder="PhoneNumber" required="">

                    <button type="submit">Sign up</button>
                </form>
            </div>



            <div class="login">
                <form action="login" method="post">
                    <label for="chk" aria-hidden="true">Login</label>
                    <input type="text" name="userName" placeholder="UserName" required="">
                    <input type="password" name="password" placeholder="Password" required="">
                    <button type="submit">Login</button>
                </form>
            </div>
        </div>
    </body>
</html>

