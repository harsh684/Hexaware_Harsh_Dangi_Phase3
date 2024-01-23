package com.hexaware.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.myapp.entity.Department;


public class DeptDaoImp implements IDeptDao {

	Connection conn = null;
	
	public DeptDaoImp() {
		conn = DBUtil.getConnection();
	}
	
	@Override
	public int insert(Department d) {
		int row = 0;
		try {
			PreparedStatement ps = conn.prepareStatement("insert into dept values(?,?,?)");
			
			ps.setInt(1, d.getDno());
			ps.setString(2, d.getDname());
			ps.setString(3, d.getLocation());
			
			row = ps.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return row;
	}

	@Override
	public int update(Department d) {
		int row = 0;
		try {
			PreparedStatement ps = conn.prepareStatement("update dept set dname = ?, location = ? where dno = ?");
			
			ps.setString(1, d.getDname());
			ps.setString(2, d.getLocation());
			ps.setInt(3, d.getDno());
			
			row = ps.executeUpdate();
			
			System.out.println(row + " Rows Updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return row;
	}

	@Override
	public int deleteOne(int dno) {
		int row = 0;
		try {
			PreparedStatement ps = conn.prepareStatement("delete from dept where dno = ?");
			
			ps.setInt(1, dno);
			
			row = ps.executeUpdate();
			
			System.out.println(row + " Rows Deleted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public Department selectOne(int dno) {
		Department dept = null;
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from dept where dno = "+dno);
			
			while(resultSet.next()) {
				dept = new Department();
				dept.setDno(resultSet.getInt("dno"));
				dept.setDname(resultSet.getString("dname"));
				dept.setLocation(resultSet.getString("location"));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dept;
	}

	@Override
	public List<Department> selectAll() {
		Department dept = null;
		List<Department> list = new ArrayList<Department>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from dept");
			
			while(resultSet.next()) {
				dept = new Department();
				dept.setDno(resultSet.getInt("dno"));
				dept.setDname(resultSet.getString("dname"));
				dept.setLocation(resultSet.getString("location"));
				
				list.add(dept);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
