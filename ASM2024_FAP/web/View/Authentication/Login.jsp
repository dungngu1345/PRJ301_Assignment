<%-- 
    Document   : Login
    Created on : Mar 5, 2024, 10:14:30 PM
    Author     : Admin
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FPT University Academic Portal</title>
    <style>
        /* Basic Reset */
        body, h1, h2, h3, h4, h5, h6, p, form, input, button {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Page styling */
        body {
            font-family: 'Arial', sans-serif;
            background-color: #ffffff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }

        .container {
            background: #fff;
            width: 500px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        .header {
            text-align: center;
            padding-bottom: 20px;
            border-bottom: 1px solid #eee;
            margin-bottom: 20px;
        }

        .login-form {
            display: flex;
            flex-direction: column;
        }

        .input-group {
            margin-bottom: 15px;
        }

        .input-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .login-form button {
            padding: 10px;
            border: none;
            border-radius: 4px;
            background: #0066ff;
            color: white;
            cursor: pointer;
        }

        .login-form button:hover {
            background: #0051cc;
        }

        .footer {
            text-align: center;
            margin-top: 20px;
            font-size: 0.8em;
        }
		.top-right {
            position: fixed; /* Hoặc absolute, tùy vào nhu cầu */
            top: 0;
            right: 0;
            z-index: 1000; /* Đảm bảo nó nằm trên cùng */
        }

        /* Cần thiết khi sử dụng position: fixed để không che khuất nội dung khác */
        body {
            padding-top: 60px; /* Điều chỉnh dựa vào chiều cao thực tế của khối bạn đặt ở trên cùng */
        }
    </style>
</head>
<body>
	<div class="row top-right">
        <div class="col-md-4">
            <table>
                <tbody>
                    <tr>
                        <td colspan="2" class="auto-style1"><strong>FAP mobile app (myFAP) is ready at</strong></td>
                    </tr>
                    <tr>
                        <td>
                            <a href="https://apps.apple.com/app/id1527723314">
                                <img src="https://fap.fpt.edu.vn/images/app-store.png" style="width: 120px; height: 40px" alt="apple store">
                            </a>
                        </td>
                        <td>
                            <a href="https://play.google.com/store/apps/details?id=com.fuct">
                                <img src="https://fap.fpt.edu.vn/images/play-store.png" style="width: 120px; height: 40px" alt="google store">
                            </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="container">
        <div class="header">
            <h1>FPT University Academic Portal</h1>
        </div>
		
        <form class="login-form" action="login" method="POST">
            <div class="input-group">
                <input type="text" name="username" placeholder="Username" required>
            </div>
            <div class="input-group">
                <input type="password" name="password" placeholder="Password" required>
            </div>
            <button type="submit">Đăng nhập</button>
        </form>
        <div class="footer">
            <p>© Powered by FPT | CMS | Library | books24x7</p>
        </div>
    </div>
</body>
</html>

