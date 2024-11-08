import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VNDToUSDServlet")
public class VNDToUSDServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double vnd = Double.parseDouble(request.getParameter("vnd"));
        double usd = vnd / 23000; // Ví dụ tỉ giá 1 USD = 23000 VNĐ

        // Định dạng thời gian theo múi giờ US
        Locale locale = new Locale("en", "US");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", locale);
        String currentTime = sdf.format(new Date());

        request.setAttribute("vnd", vnd);
        request.setAttribute("usd", usd);
        request.setAttribute("currentTime", currentTime);
        request.getRequestDispatcher("vndToUsdResult.jsp").forward(request, response);
    }
}
