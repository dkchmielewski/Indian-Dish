package com.ayurveda.web.dao;

import com.ayurveda.web.model.Dish;
import java.sql.*;

public class DishDao {

	public Dish getDish(int id){
		
		Dish dish = new Dish();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","#Prince1970#");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from dishes where id=" + id);
			if(rs.next()) {
				dish.setId(rs.getInt("id"));
				dish.setName(rs.getString("name"));
				dish.setIngredients(rs.getString("ingredients"));
				dish.setDescription(rs.getString("description"));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return dish;
	}
	
}
