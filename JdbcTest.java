package com.ashok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok","root","Ashok@19970728");
		String sql="insert into emp values(2,'Rani',22);";
		Statement st=con.createStatement();
		int count=st.executeUpdate(sql);
		System.out.println("inserted :"+count);
		
	}

}
