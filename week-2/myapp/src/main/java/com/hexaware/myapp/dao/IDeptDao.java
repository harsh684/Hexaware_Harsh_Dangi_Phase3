package com.hexaware.myapp.dao;

import java.util.List;

import com.hexaware.myapp.entity.Department;


public interface IDeptDao {
	
	int insert(Department d);
	
	int update(Department d);
	
	int deleteOne(int dno);
	
	Department selectOne(int dno);
	
	List<Department> selectAll();
	
}
