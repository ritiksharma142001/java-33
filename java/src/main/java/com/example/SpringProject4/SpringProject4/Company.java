package com.example.SpringProject4.SpringProject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	@Autowired
	@Qualifier("emp2")
	Employee emp;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("0-para constructor");
	}

	public Company(Employee emp) {
		super();
		System.out.println("para constructor");
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		System.out.println("setter method");
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [emp=" + emp + "]";
	}
	
}
