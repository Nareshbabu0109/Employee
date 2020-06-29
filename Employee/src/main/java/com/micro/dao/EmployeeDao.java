package com.micro.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.Pojo.EmployeePojo;






@Repository
public interface EmployeeDao extends JpaRepository<EmployeePojo, Integer>{
	
	
	

}
