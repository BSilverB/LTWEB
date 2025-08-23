package vn.iotstar.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();

	    String username = request.getParameter("username");
	    String password = request.getParameter("password");

	    if ("trungnh".equals(username) && "123".equals(password)) {
	        out.print("<h3>Chào mừng bạn, " + username + "</h3>");
	        // Nếu muốn dùng session:
	        // HttpSession session = request.getSession();
	        // session.setAttribute("username", username);
	    } else {
	        out.print("<h3 style='color:red;'>Tài khoản hoặc mật khẩu không chính xác</h3>");
	        // Hiển thị lại form Login.html
	        request.getRequestDispatcher("Login.html").include(request, response);
	    }
	}

}
