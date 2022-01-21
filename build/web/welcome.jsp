<%-- 
    Document   : welcome
    Created on : Aug 19, 2020, 12:52:42 AM
    Author     : User
--%>

<%@page import="model.Person"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet Welcome Servlet</title>
    </head>
    <body>

        <%
            List<Person> listPersons = (List<Person>) request.getAttribute("listPers");

            for (Person p : listPersons) {
                System.out.println("name" + p.getName());
            }

        %>
        <% for (Person p : listPersons) {%>           

    <%=p.getName()%>;   <br>


        <%}%>

        <a href="student.html" >new</a>


    </body>
</html>
