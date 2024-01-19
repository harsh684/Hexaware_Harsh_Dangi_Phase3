package dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	static Connection connection = null;
	public static Connection getConnection() {
		try {
			FileReader reader = new FileReader("resources/database.properties");
			
			Properties properties = new Properties();
			
			properties.load(reader);
			
			Class.forName(properties.getProperty("driverclass"));
			
			String url = properties.getProperty("url");
			String usn = properties.getProperty("username");
			String pwd = properties.getProperty("password");
			
			connection = DriverManager.getConnection(url,usn,pwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
