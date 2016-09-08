<%-- 
    Document   : home
    Created on : Aug 31, 2016, 9:36:34 PM
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
        <h1>Class 3 Lab</h1>

        <p>Lab Activity #1<br>
            The lab was completed and the assignment was uploaded to 
            <a href="https://github.com/davidarnellWCTC/Class3Lab">Github</a>
        </p>

        <p>Lab Activity #2</p>

        
        <form id="activity2Form" name="activity2Form" method="POST" action="pager">
            <!-- No input type as this form calls a servlet action with no data -->

            <input type="submit" name="submit" value="submit"/>

        </form>
        
        
        <p>Lab Activity #3</p>
        <p>The page for Activity 3 is available <a href="PageGenerator2.jsp">here</a>.</p>
        
        <p>Lab Activity #4</p>
        <p>Lab Activity #4 checks the current time and displays a message based on the result.</p>
        
        
    
</body>
</html>
