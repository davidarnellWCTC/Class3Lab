<%-- 
    Document   : welcome
    Created on : Sep 7, 2016, 7:15:19 PM
    Author     : David Arnell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Class 3 Lab</title>
    </head>
    <body>
        <h1>Activity #4</h1>
        
        <p>
            <%
                // Calls the responseMessage Object with the "responseMessage" key
                Object genericMessageObject = request.getAttribute("welcomeMessage");
                //Object errorObject = request.getAttribute("errorMessage");
                
                String welcomeTimeMessage = "unknown";
                
                if (genericMessageObject != null){
                    // sets the responseObject to a String to be displayed
                    welcomeTimeMessage = genericMessageObject.toString();
                }
                
                out.println("<p style=\"color:blue; font-weight:bold;\">" + welcomeTimeMessage + "</p");
            %>
                
        </p>
        
        <p>The form in this lab takes the entered name and adds it to the time display message.</p>
        <h2>Enter your name for the customized time of day message.</h2>
        <!-- "id" and "name" not required -->
        <!-- "method" and "action"  required -->
        <form id="timeMessageForm" name="timeMessageForm" method="POST" action="PageGenerator">
            <!-- input type is "text" will go to the servlet as a HttpServletRequest Object -->
            Name:<input type="text" name="myName" value=""/><br>
            <input type="submit" name="submit" value="submit"/>
            
        </form>
        <p><a href="index.jsp">Back to Home</a></p>
        
        <p>
            <%
                // Calls the responseMessage Object with the "responseMessage" key
                Object namedMessage = request.getAttribute("namedMessage");
                //Object errorObject = request.getAttribute("errorMessage");
                
                String welcomeTimeMessage = "unknown";
                
                if (responseObject != null){
                    // sets the responseObject to a String to be displayed
                    namedMessage = responseObject.toString();
                }
                
                out.println("<p style=\"color:blue; font-weight:bold;\">" + namedMessage + "</p");
            %>
                
        </p>
        
    </body>
</html>
