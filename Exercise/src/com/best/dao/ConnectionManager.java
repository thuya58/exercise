package com.best.dao;
import java.sql.*;

public class ConnectionManager {
	public static String driver_class="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/exercise_db";
	public static String userName="root";
	public static String passWord="root";
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName(driver_class);
		Connection con=DriverManager.getConnection(url,userName,passWord);
		return con;
	}

}
