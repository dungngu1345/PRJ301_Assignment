<%-- 
    Document   : ViewScoreStudent
    Created on : Mar 14, 2024, 12:19:38 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <html>
        <head>
            <title>Grade Report</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                }
                table {
                    width: 30%;
                    border-collapse: collapse;
                }
                th, td {
                    border: 1px solid #000;
                    padding: 8px;
                    text-align: left;
                }
                th {
                    background-color: #4CAF50;
                    color: white;
                }
                .total-row {
                    font-weight: bold;
                }
                .course-total {
                    font-size: larger;
                    font-weight: bold;
                }
                .table{
                    margin: 0,auto;
                }
            </style>
        </head>
        <body>
            <form action="score" method="post" id="form" onchange="document.getElementById('form').submit()">
                <table>
                    <tr>
                        <td>
                            StudentId:
                            <select name="studentId">
                                <c:forEach items="${requestScope.students}" var="s">
                                    <option value="${s.id}"
                                            <c:if test="${studentId eq s.id}">
                                                selected ="selected"
                                            </c:if>
                                            >
                                        ${s.name}-${s.id}
                                    </option>
                                </c:forEach>
                            </select> 
                        </td>
                        <td>
                            SubjectId:
                            <select name="subjectId">
                                <c:forEach items="${requestScope.subjects}" var="s">
                                    <option value="${s.id}"
                                            <c:if test="${subjectId eq s.id}">
                                                selected ="selected"
                                            </c:if>
                                            >
                                        ${s.name}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>


            </form>

            <c:if test="${requestScope.studentId ne null}">
                <table class="table">
                    <tr>
                        <th>GRADE ITEM</th>
                        <th>WEIGHT</th>
                        <th>VALUE</th>
                        <th>COMMENT</th>
                    </tr>
                    <c:forEach items="${requestScope.grades}" var="g">
                        <tr>
                            <td>
                                ${g.name}
                            </td>
                            <td>
                                ${g.weight}
                            </td>
                            <td>
                                ${g.score}
                            </td>
                            <td>
                            </td>
                        </tr>
                    </c:forEach>

                    <!-- More rows for Assignment, Progress Test, and Final Exam -->
                    <tr class="course-total">
                        <td rowspan="2">COURSE TOTAL</td>
                    </tr>
                    <tr class="course-total">
                        <td colspan="1">STATUS</td>
                        <td colspan="2">${average}</td>
                    </tr>
                </table>
            </c:if>


        </body>
    </html>

</body>
</html>
