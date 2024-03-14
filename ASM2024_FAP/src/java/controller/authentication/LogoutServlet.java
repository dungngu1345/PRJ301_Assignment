import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy session hiện tại
        HttpSession session = request.getSession(false);
        // Kiểm tra nếu session tồn tại, xóa thông tin đăng nhập
        if (session != null) {
            session.invalidate(); // Xóa session, đăng xuất người dùng
        }
        // Chuyển hướng người dùng về trang đăng nhập hoặc trang chủ
        response.sendRedirect("login.jsp"); // Giả sử trang đăng nhập là login.jsp
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response); // Gọi doGet nếu bạn muốn xử lý đăng xuất trong cả POST
    }
}
