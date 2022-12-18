<%-- 
    Document   : home.jp
    Created on : Dec 15, 2022, 11:06:16 PM
    Author     : VothanaCHY
--%>

<%@page import="num.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="num.DataSQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.2/jquery.min.js" integrity="sha512-tWHlutFnuG0C6nQRlpvrEhE4QpkG1nn2MOUMWmUeRePl4e3Aki0VB6W1v3oLjFtd0hVOtRQ9PHpSfN6u6/QXkQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/login.css"/>
        <jsp:useBean id="bean" class="num.DataSQL" />
    </head>
    <body>
        
        <%
            boolean isValid = false;
            if(request.getParameter("username") != "" && request.getParameter("username") != null){
                DataSQL data = new DataSQL();
                List<User> users = data.selectAllUsers();
                
                out.print(request.getParameter("username").toString());
                
                for(User user : users){
                    if(request.getParameter("username").toString() == "vothana"){
                        out.print("ssddddddd");
                        if(user.getPassword() == request.getParameter("passwpord")){
                        out.print("sssss");
                            isValid = true;
                            break;
                        }
                    }
                }
            }else{
                isValid = false;
            }
        %>
        
        
        <div class="wrapper fadeInDown">
            <div id="formContent">
              <!-- Tabs Titles -->
              <h2 class="active"> Sign In </h2>

              <div class="fadeIn first">
                  <img src="./images/NUM Logo.png" id="icon" alt="User Icon" width="100" height="100"/>
              </div>
              <br><!-- comment -->
              <form action="login.jsp" method="get">
                <input type="text" id="login" class="fadeIn second" name="username" placeholder="username">
                <input type="password" id="password" class="fadeIn third" name="password" placeholder="password">
                <% 
                    if(request.getParameter("username") != "" && request.getParameter("username") != null){
                        if(!isValid){
                            out.print(" <p style='color: red'>Invalid credential</p>");
                        }else{
                            out.print("sss");
                        }
                    }
                %>
                <input type="submit" class="fadeIn fourth" value="Log In">
              </form>
            </div>
          </div>
    </body>
</html>
