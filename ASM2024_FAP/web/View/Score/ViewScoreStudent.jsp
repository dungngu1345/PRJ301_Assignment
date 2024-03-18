<%-- 
    Document   : ViewScoreStudent
    Created on : Mar 14, 2024, 12:19:38 PM
    Author     : Admin
--%>

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
            
            <table class="table">
                <tr>
                    <th>GRADE CATEGORY</th>
                    <th>GRADE ITEM</th>
                    <th>WEIGHT</th>
                    <th>VALUE</th>
                    <th>COMMENT</th>
                </tr>
                <tr>
                    <td rowspan="2">Computer Project</td>
                    <td>Computer Project</td>
                    <td>15.0 %</td>
                    <td><!-- Value here --></td>
                    <td><!-- Comment here --></td>
                </tr>
                <tr class="total-row">
                    <td>Total</td>
                    <td>15.0 %</td>
                    <td><!-- Total value here --></td>
                    <td></td>
                </tr>
                <!-- More rows for Assignment, Progress Test, and Final Exam -->
                <tr class="course-total">
                    <td colspan="2">COURSE TOTAL</td>
                    <td>AVERAGE</td>
                    <td><!-- Average here --></td>
                    <td></td>
                </tr>
                <tr class="course-total">
                    <td colspan="4">STATUS</td>
                    <td>STUDYING</td>
                </tr>
            </table>

        </body>
    </html>

</body>
</html>
