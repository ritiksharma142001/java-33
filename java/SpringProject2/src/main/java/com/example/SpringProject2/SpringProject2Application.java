package com.example.SpringProject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringProject2Application {

	public static void main(String[] args) {
		// To activate the bean using config.xml by this class
		ClassPathXmlApplicationContext ctXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
		
		
		//get the reference of that class via id pers and cast it to Person object
		Student st = (Student)ctXmlApplicationContext.getBean("stu");
		
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.marks);
		
		st.study();
		st.doProject();
		
Student st2 = (Student)ctXmlApplicationContext.getBean("stu2");
		
		System.out.println(st2.id);
		System.out.println(st2.name);
		System.out.println(st2.marks);
		
		st2.study();
		st2.doProject();
		
		Professor pr = (Professor)ctXmlApplicationContext.getBean("pro");
		
		System.out.println(pr.id);
		System.out.println(pr.name);
		System.out.println(pr.subject);
		
		pr.teach();
		pr.checkAssignment();
		
		Professor pr2 = (Professor)ctXmlApplicationContext.getBean("pro2");
		
		System.out.println(pr2.id);
		System.out.println(pr2.name);
		System.out.println(pr2.subject);
		
		pr2.teach();
		pr2.checkAssignment();

	}

}
