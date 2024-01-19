package presentation;

import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Department;

public class Client {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDeptDao dao = new DeptDaoImp();
		
		boolean flag = true;
		
		System.out.println("****Welcome to DMS****");
		
		while(flag) {
			
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.SELECT BY ID");
			System.out.println("5.SELECT ALL");
			System.out.println("6.EXIT");
		
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:dao.insert(Client.readData());
					break;
					
				case 2:dao.update(Client.readData());
					break;
					
				case 3:System.out.println("Enter dno");
					dao.deleteOne(sc.nextInt());
				break;
				
				case 4:System.out.println("Enter dno");
					System.out.println(dao.selectOne(sc.nextInt()));
				break;
				
				case 5:
					dao.selectAll().stream().forEach(System.out::println);
				break;
				
				case 6:flag=false;
				break;
				
				default:break;
			}
		}
	}
	
	public static Department readData() {
		System.out.println("Entern Dno");
		int dno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new/updated Dname");
		String dname = sc.nextLine();
		
		System.out.println("Enter new/updated Location");
		String location = sc.nextLine();
		
		Department d = new Department(dno,dname,location);
		
		return d;
	}

}
