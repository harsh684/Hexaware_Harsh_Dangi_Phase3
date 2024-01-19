package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root",
					"harsh");

			String insert = "insert into Employees(eid,ename,salary,job) values(111,'Mukesh',40000,'HR')";

			Statement stmt = connection.createStatement();

			//to call procedure
//			CallableStatement scstmt = connection.prepareCall("{call mypro()}"); 
//			
//			scstmt.setInt(1, 101);
//			
//			scstmt.execute();
			
			int count = stmt.executeUpdate(insert);

			System.out.println(count + " Rows Updated");

			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
