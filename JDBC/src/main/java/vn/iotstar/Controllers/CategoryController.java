package vn.iotstar.Controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.Models.Category;
import vn.iotstar.Servicesimpl.CategoryServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet(urlPatterns = { "/admin/category/list" })
public class CategoryController extends HttpServlet {
	
	CategoryServiceImpl cateService = new CategoryServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
	List<Category> cateList = cateService.getAll();
	
	System.out.println("Category list size: " + cateList.size());

	req.setAttribute("cateList", cateList);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/list-category.jsp");
	dispatcher.forward(req, resp);
	}

}
