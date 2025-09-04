package vn.iotstar.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.Servicesimpl.CategoryServiceImpl;

import java.io.IOException;

/**
 * Servlet implementation class CategoryDeleteController
 */
@WebServlet("/CategoryDeleteController")
public class CategoryDeleteController extends HttpServlet {
	CategoryServiceImpl cateService = new CategoryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		cateService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/category/list");
	}

}
