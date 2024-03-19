<%-- 
    Document   : TimeTable
    Created on : Mar 13, 2024, 1:49:34 PM
    Author     : Admin
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .date{
                margin-left: auto;
            }
            body {
                display: flex;
                justify-content: center;
            }
            table {
                border-collapse: collapse; /* Optional: for better border appearance */
            }
            table, th, td {
                border: 1px solid black;
            }
            th, td {
                padding: 8px; /* Optional: for cell padding */
            }
            .firstrow{
                background-color: blue;
                color: white;
            }
        </style>
    </head>
    <body>
        <form action="timetable" method="GET">
            <div class="date"><div/>
            <input type="hidden" value="${param.id}" name="id"/>
            From: <input type="date" name="from" value="${requestScope.from}"/> <br/>
            To: <input type="date" name="to" value="${requestScope.to}"/>
            <input type="submit" value="View"/>
            <div/>
        </form>
        <table>
            <tr >
                <td></td>
                <c:forEach items="${requestScope.dates}" var="d">
                    <td class="firstrow">
                        (<fmt:formatDate pattern="E" value="${d}" />)
                        ${d}</td>
                </c:forEach>
            </tr>
            <c:forEach items="${requestScope.slots}" var="slot">
                <tr>
                    <td>${slot.name}</td>
                    <c:forEach items="${requestScope.dates}" var="d">
                        <td>
                            <c:forEach items="${requestScope.lessions}" var="les">
                                <c:if test="${les.date eq d and les.slot.id eq slot.id}">
                                    ${les.group.name} - ${les.group.subject.name}
                                    <a href="att?lessionId=${les.id}">
                                        <c:if test="${les.attended}">Edit</c:if>
                                        <c:if test="${!les.attended}">Take</c:if>
                                    </a>
                                </c:if>
                            </c:forEach>
                        </td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
