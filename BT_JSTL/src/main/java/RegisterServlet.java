import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lang = request.getParameter("lang");
        if (lang == null) {
            lang = "vi"; // default to Vietnamese if no lang parameter is provided
        }
        // Lưu ngôn ngữ vào session
        request.getSession().setAttribute("lang", lang);
        
        // Chuyển hướng người dùng đến trang đăng ký tương ứng
        if ("en".equals(lang)) {
            request.getRequestDispatcher("registerForm_en.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("registerForm_vi.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String lang = request.getParameter("lang");

        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("phone", phone);
        request.setAttribute("lang", lang);

        // Sau khi đăng ký, chuyển hướng tới trang kết quả đăng ký
        if ("en".equals(lang)) {
            request.getRequestDispatcher("registerResult_en.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("registerResult_vi.jsp").forward(request, response);
        }
    }
}
