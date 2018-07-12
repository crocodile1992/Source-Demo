package org.o7planning.simplewebapp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.simplewebapp.beans.Product;
import org.o7planning.simplewebapp.utils.DBUtils;
import org.o7planning.simplewebapp.utils.MyUtils;

@WebServlet(urlPatterns = { "/addProductToCard" })
public class AddProductToCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddProductToCardServlet() {
		super();
	}

	// Hiển thị trang tạo sản phẩm.
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String code = (String) request.getParameter("code");
		String name = (String) request.getParameter("name");
		if (code == null) {
			System.out.println("code la NULL");
			code = "";
		}
		if (name == null) {
			System.out.println("code la NULL");
			name = "";
		}
		Connection conn = MyUtils.getStoredConnection(request);

		String errorString = null;
		List<Product> list = null;
		try {
			list = DBUtils.queryProduct(conn, code, name);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		// Lưu thông tin vào request attribute trước khi forward sang views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("productList", list);

		// Forward sang /WEB-INF/views/productListView.jsp
		RequestDispatcher dispatcher = request
				.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/addProductToCardView.jsp");
		dispatcher.forward(request, response);
	}

	// Khi người dùng nhập các thông tin sản phẩm, và nhấn Submit.
	// Phương thức này sẽ được gọi.
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String code = (String) request.getParameter("code");
		String name = (String) request.getParameter("name");
		if (code == null) {
			System.out.println("code la NULL");
			code = "";
		}
		if (name == null) {
			System.out.println("code la NULL");
			name = "";
		}
		Connection conn = MyUtils.getStoredConnection(request);

		String errorString = null;
		List<Product> list = null;
		try {
			list = DBUtils.queryProduct(conn, code, name);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		// Lưu thông tin vào request attribute trước khi forward sang views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("productList", list);

		// Forward sang /WEB-INF/views/productListView.jsp
		RequestDispatcher dispatcher = request
				.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/addProductToCardView.jsp");
		dispatcher.forward(request, response);
	}

}
