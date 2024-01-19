package crud;


public class PSDemo {
	public static void main(String[] args) {

		IDeptDAO obj = new DeptDaoImpl();
		
		obj.showDept();
		obj.deleteDept(60);
		obj.insertDept();
	}

}
