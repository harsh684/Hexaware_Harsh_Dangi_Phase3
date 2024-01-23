package com.hexaware.myapp.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hexaware.myapp.dao.DeptDaoImp;
import com.hexaware.myapp.dao.IDeptDao;
import com.hexaware.myapp.entity.Department;

class DeptDaoImpTest {

	static IDeptDao dao = null;
	static Department dept = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = new DeptDaoImp();
		dept = new Department();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		dao = null;
		dept = null;
	}

	@Test
	@Disabled
	void testInsert() {
		Department d = new Department();
		d.setDno(110);
		d.setDname("TestDept");
		d.setLocation("Test");
		
		assertNotEquals(0, dao.insert(d));
	}

	@Test
	void testUpdate() {
		Department d = new Department();
		d.setDno(110);
		d.setDname("TestUpdatedDept");
		d.setLocation("UpdatedTest");
		
		assertNotEquals(0, dao.insert(d));
	}

	@Test
	void testDeleteOne() {
		assertEquals(1, dao.deleteOne(110));
	}

	@Test
	void testSelectOne() {
		assertNotNull(dao.selectOne(10));
	}

	@Test
	void testSelectAll() {
		List<Department> list = dao.selectAll();
		
		Department dept = list.get(0);
		
		//assertTrue(dept.getDno()>0);
		
		assertNotNull(list);
	}

}
