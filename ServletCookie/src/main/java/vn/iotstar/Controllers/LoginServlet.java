package vn.iotstar.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class vidu1
 */
@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    // Chuyển hướng người dùng về trang Login.html
	    response.sendRedirect(request.getContextPath() + "/index.html");
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if ("Bao".equals(user) && "123".equals(pass)) {
            Cookie cookie = new Cookie("username", user);
            cookie.setMaxAge(10); // 30 giây
            response.addCookie(cookie);
            response.sendRedirect(request.getContextPath() + "/hello");
        } else {
            response.sendRedirect(request.getContextPath() + "/login");
        }
    }
}
