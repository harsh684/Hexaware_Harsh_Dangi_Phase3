package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptDaoImpl implements IDeptDAO {

	Connection connection = null;
	Statement statement;
	PreparedStatement ps;
	ResultSet resultSet;
	
	@Override
	public void showDept()  {
		boolean isupdated = false;
		try {
			connection = DBUtil.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select Dno,Dname from dept");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void deleteDept(int dno) {
		try {
			connection = DBUtil.getConnection();
			ps = connection.prepareStatement("delete from dept where Dno = ?");
			ps.setInt(1, dno);
			int row = ps.executeUpdate();
			
			System.out.println(row+" Row Updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertDept() {
		
		try {
			connection = DBUtil.getConnection();
			ps = connection.prepareStatement("insert into dept values(?,?,?)");
			ps.setInt(1, 60);
			ps.setString(2, "HR");
			ps.setString(3, "Kichha");
			
			int row = ps.executeUpdate();
			
			System.out.println(row+" Row Inserted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
