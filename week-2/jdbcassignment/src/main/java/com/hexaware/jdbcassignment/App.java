package com.hexaware.jdbcassignment;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.jdbcassignment.beans.Certification;
import com.hexaware.jdbcassignment.config.AppConfig;
import com.hexaware.jdbcassignment.service.CertificateServiceImp;
import com.hexaware.jdbcassignment.service.ICertificateService;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
	
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        ICertificateService service = context.getBean(CertificateServiceImp.class);
        
        boolean flag = true;
		
		while(flag) {
			
			System.out.println("1.INSERT");
			System.out.println("2.SELECT BY TITLE");
			System.out.println("3.SELECT ALL");
			System.out.println("4.EXIT");
		
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
						if(service.selectCertification(sc.nextLine())==null)
							throw new NullPointerException();
						else
							System.out.println(service.selectCertification(sc.nextLine()));
					
					}catch(NullPointerException e) {
						e.printStackTrace();
					}
				break;
				
				case 3:
					try {
						if(service.selectAllCertification()!=null)
							service.selectAllCertification().stream().forEach(System.out::println);
						else
							throw new NullPointerException();
					
					}catch(NullPointerException e) {
						e.printStackTrace();
					}
				break;
				
				case 4:flag=false;
				break;
				
				default:break;
			}
		}
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
