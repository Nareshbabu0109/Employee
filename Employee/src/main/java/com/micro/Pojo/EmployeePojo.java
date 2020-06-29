package com.micro.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeePojo {
	
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Emp_id")
	private String employeeid;
	@Column(name="Name")
	private String name;
	@Column(name="Desigination")
	private String desigination;
	@Column(name="Salary")
	private String Salary;
	@Column(name="Experience")
	private String experience;
	
	/*
	 * @ManyToOne private CompanyPojo company;
	 * 
	 * 
	 * 
	 * public CompanyPojo getCompany() { return company; } public void
	 * setCompany(CompanyPojo company) { this.company = company; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	

}
