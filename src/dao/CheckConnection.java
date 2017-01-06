package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.PreparedStatement;

public class CheckConnection {

	
	public static Connection connectionBD(){
	try {
		Connection myconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/volprojet","root","simowahabi");

		return myconnection;

		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		   System.out.println("you have a problems of connecting with database");
	}
	return null;
	}
	




	
	
}
