package com.learn.hibernate.OneToMany.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developer {
	@Id
	int dev_ID;
	String dev_Name;
	
	@ManyToMany
	List<Project> project;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int dev_ID, String dev_Name, List<Project> project) {
		super();
		this.dev_ID = dev_ID;
		this.dev_Name = dev_Name;
		this.project = project;
	}

	public int getDev_ID() {
		return dev_ID;
	}

	public void setDev_ID(int dev_ID) {
		this.dev_ID = dev_ID;
	}

	public String getDev_Name() {
		return dev_Name;
	}

	public void setDev_Name(String dev_Name) {
		this.dev_Name = dev_Name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Developer [dev_ID=" + dev_ID + ", dev_Name=" + dev_Name + ", project=" + project + "]";
	}
	
	

}
