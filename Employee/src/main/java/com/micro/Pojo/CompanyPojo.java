package com.micro.Pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;








@Entity
@Table(name="company_table")
public class CompanyPojo {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="company_name")
	private String companyname;
	@Column(name="hr_name")
	private String hrname;
	
	/*
	 * @OneToMany private List<EmployeePojo> employee;
	 * 
	 * 
	 * public List<EmployeePojo> getEmployee() { return employee; } public void
	 * setEmployee(List<EmployeePojo> employee) { this.employee = employee; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getHrname() {
		return hrname;
	}
	public void setHrname(String hrname) {
		this.hrname = hrname;
	}
	
	

}
