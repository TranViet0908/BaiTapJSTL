import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/USDToVNDServlet")
public class USDToVNDServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double usd = Double.parseDouble(request.getParameter("usd"));
        double vnd = usd * 23000; // Ví dụ tỉ giá 1 USD = 23000 VNĐ

        // Lấy thời gian hiện tại theo múi giờ Việt Nam
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(timeZone);
        String currentTime = sdf.format(new Date());

        request.setAttribute("usd", usd);
        request.setAttribute("vnd", vnd);
        request.setAttribute("currentTime", currentTime);
        request.getRequestDispatcher("usdToVndResult.jsp").forward(request, response);
    }
}
