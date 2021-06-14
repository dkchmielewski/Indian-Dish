package com.ayurveda.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayurveda.web.dao.DishDao;
import com.ayurveda.web.model.Dish;

public class GetDishController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		DishDao dao = new DishDao();
		Dish d1 = dao.getDish(id);
		
		request.setAttribute("dish1", d1);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowDish.jsp");
		rd.forward(request, response);
		
	}

}
