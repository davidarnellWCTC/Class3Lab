<%-- 
    Document   : PageGenerator2
    Created on : Sep 7, 2016, 6:58:11 PM
    Author     : David Arnell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Activity 3</title>
    </head>
    <body>
        <h1>Activity #3</h1>

        <table border="1" style="width:40%">"
            <caption><H2>Activity #3 Table<H2></caption>

                        <%
                            int row = 1;
                            int column = 1;
                            while (row <= 3) {
                                out.println("<tr>");
                                while (column <= 3) {

                                    out.println("<th>Row #: " + row + "; Column #: " + column);
                                    column++;
                                }
                                out.println("</tr>");
                                // reset the value of the column back to 1
                                column = 1;
                                // increase the row count.
                                row++;
                            }
                        %>


                        </table>

                        <p><a href=\"home.jsp\">Back to Home</a></p>

                        </body>
                        </html>
