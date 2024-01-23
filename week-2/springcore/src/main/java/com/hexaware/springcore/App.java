package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.entities.Employee;
import com.hexaware.springcore.services.IService;
import com.hexaware.springcore.services.ServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
        Employee emp = context.getBean(Employee.class);
        
       // Address address = context.getBean(Address.class);
        
       // address.setCity("kichha");
        
        emp.setEid(101);
        emp.setName("king");
        //emp.setAddress(); //setter method dependency injection
    
        System.out.println(emp);
        System.out.println(emp.getAddress());
        
        IService service = context.getBean(ServiceImp.class);
        
        service.getService();
        
        String name = context.getBean(String.class);
        
        System.out.println(name);
    }
}
