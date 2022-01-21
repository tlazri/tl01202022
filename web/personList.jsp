<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="WEB-INF/person.tld" prefix="mm" %>  
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
        <table border="2">




            Current Date and Time is: <mm:currentDate/> 



            Session:= ${sessionId}
            <mm:IfWeekDayTag> 
                <c:forEach var="pers" items="${x}" >
                    <tr>
                        <td>  ${pers.id} </td>
                        <td>   ${pers.name} </td>
                        <td>    <a href="<c:url value='/student?x=${pers.id}&act=delete'/>">delete</a>   
                        </td>
                        <td>     <a href="<c:url value='/student?x=${pers.id}&act=update'/>">update</a>   <br>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <br>
        </mm:IfWeekDayTag> 

        <a href="student.html" >new</a> <br>
        <a href="<c:url value='/logout'/>">logout</a>   


    </body>
</html>
