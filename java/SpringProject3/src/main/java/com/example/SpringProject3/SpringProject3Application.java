package com.example.SpringProject3;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringProject3Application {

	public static void main(String[] args) {
		// To activate the bean using config.xml by this class
				ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
				
				
////				get the reference of that class via id pers and cast it to Person object
//				Laptop laptop = (Laptop)ctx.getBean("lappy");
//				
//				System.out.println("Laptop 1 id: " + laptop.laptopId);
//				System.out.println("Laptop 1 brand: " +laptop.laptopBrand);
//				System.out.println("Laptop 1 cost: " + laptop.laptopCost);
//				
//				laptop.switchOn();
//				laptop.shutDown();		
//				
//				System.out.println("----------------------------------------------");
//				
//				Laptop laptop2 = (Laptop)ctx.getBean("lappy2");
//				
//				System.out.println("Laptop 2 id: " + laptop2.laptopId);
//				System.out.println("Laptop 2 brand: " +laptop2.laptopBrand);
//				System.out.println("Laptop 2 cost: " + laptop2.laptopCost);
//				
//				laptop2.switchOn();
//				laptop2.shutDown();
				
				
				// Employee Class
				Employee e = (Employee) ctx.getBean("emp1");
				System.out.println(e);
				

	}

}
