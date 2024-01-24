package com.hexaware.hibernateassignment;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.hibernateassignment.bean.Certification;
import com.hexaware.hibernateassignment.config.AppConfig;
import com.hexaware.hibernateassignment.dao.CertificationDaoImp;
import com.hexaware.hibernateassignment.dao.ICertificationDao;
import com.hexaware.hibernateassignment.service.CertificationServiceImp;
import com.hexaware.hibernateassignment.service.ICertificationService;

public class App 
{
	static Scanner sc = new Scanner(System.in);
	
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        ICertificationService service = context.getBean(CertificationServiceImp.class);
        
        boolean flag = true;
        
		while(flag) {
			
			System.out.println("1.INSERT");
			System.out.println("2.SELECT BY TITLE");
			System.out.println("3.SELECT ALL");
			System.out.println("4.UPDATE");
			System.out.println("5.DELETE");
			System.out.println("6.EXIT");
		
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					if(service.insertCertification(readData()))
						System.out.println("Record inserted succesfully");
					else
						System.err.println("Record not inserted");
					break;
					
				
				case 2:System.out.println("Enter title");
					try {
						String input = sc.next();
						Certification res = service.selectOne(input);
						if(res==null)
							throw new NullPointerException();
						else
							System.out.println(res);
					
					}catch(NullPointerException e) {
						e.printStackTrace();
					}
				break;
				
				case 3:
					try {
						List<Certification> l = service.selectAll();
						if(l!=null)
							l.stream().forEach(System.out::println);
						else
							throw new NullPointerException();
					
					}catch(NullPointerException e) {
						e.printStackTrace();
					}
				break;
				
				case 4:
					if(service.updateCertification(readData()))
						System.out.println("Record Updated");
					else
						System.err.println("Record update failed");
					break;
					
				case 5:System.out.println("Enter title");
				try {
					String input = sc.next();
					if(service.deleteCertification(input))
						System.out.println("Record deleted");
					else
						System.err.println("Record delete failed");
				
				}catch(NullPointerException e) {
					e.printStackTrace();
				}
			break;
				
				case 6:flag=false;
				break;
				
				default:break;
			}
		}
		return ;
    }
    public static Certification readData() {
		System.out.println("Enter Certificate title");
		String title = sc.next();
		sc.nextLine();
		
		System.out.println("Enter description");
		String desc = sc.nextLine();
		
		System.out.println("Enter start date(yyyy-mm-dd)");
		LocalDate startDate = LocalDate.parse(sc.next());
		
		sc.nextLine();
		
		System.out.println("Enter start date(yyyy-mm-dd)");
		LocalDate endDate = LocalDate.parse(sc.next());
		
		Certification p = new Certification(title, desc, startDate, endDate);
		
		return p;
    }
}
