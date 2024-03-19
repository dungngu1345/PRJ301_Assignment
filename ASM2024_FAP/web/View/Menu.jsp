<%-- 
    Document   : Menu
    Created on : Mar 19, 2024, 6:26:25 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        body, html {
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100%;
        }
        .img {
            position: absolute; /* Đặt vị trí tuyệt đối cho div */
            right: 0; /* Đẩy nó ra góc phải */
            top: 0; /* Đẩy nó lên trên cùng */
            z-index: 1000; /* Đảm bảo nó nằm trên các nội dung khác */
        }
        .row:after {
            content: "";
            display: table;
            clear: both;
        }
        .col-md-8, .col-md-4 {
            float: left;
            padding: 10px;
        }
        .col-md-8 {
            width: 60%;
        }
        .col-md-4 {
            width: 40%;
        }
        .row {
            width: 100%;
            position: relative; /* Cho phép nội dung khác được bố trí tương đối */
        }
        .view{
            box-shadow: 0 0 5px #c4cacc;
            padding: 15px 17px;
            margin: 34px 0 50px;
            border-radius: 0 5px 5px 5px;
            height: 100vh;
        }
        .orangeTitle{
            float: left;
            width: 300px;
            background: #ef8d01;
            padding: 10px;
            border-radius: 20px;
            font-family: Lucida Sans Unicode;
            text-align: center;
            
        }
    </style>

</head>
<body>
    <div class="row">
        <div>
            <h1><span>FPT University Academic Portal</span>
            </h1>
        </div>
        <div class="img">
            <table>
                <body><tr>
                    <td ><strong>FAP mobile app (myFAP) is ready at</strong></td>
                </tr>
                <tr>
                    <td><a href="https://apps.apple.com/app/id1527723314">
                            <img src="https://fap.fpt.edu.vn/images/app-store.png" style="width: 120px; height: 40px" alt="apple store"></a></td>
                    <td><a href="https://play.google.com/store/apps/details?id=com.fuct">
                            <img src="https://fap.fpt.edu.vn/images/play-store.png" style="width: 120px; height: 40px" alt="google store"></a></td>
                </tr>
                </body></table>
        </div>
    </div>
    <h3 class="orangeTitle">Academic Information</h3>
    <div class="view">
        <a href="/ASM2024_FAP/timetable?id=${account.lid}">View TimeTable</a> <br/>
        <a href="/ASM2024_FAP/score">View Score</a>
    </div>

</body>
</html>
