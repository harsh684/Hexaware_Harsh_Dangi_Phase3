package dao;

import java.util.List;

import entity.Department;

public interface IDeptDao {
	
	int insert(Department d);
	
	int update(Department d);
	
	int deleteOne(int dno);
	
	Department selectOne(int dno);
	
	List<Department> selectAll();
	
}
