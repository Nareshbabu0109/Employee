package com.micro.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.Pojo.EmployeePojo;
import com.micro.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empdao;
	
	public void saveEmployee(EmployeePojo emp) {
		empdao.save(emp);
		
	}
	public EmployeePojo getEmployee(Integer id) {
		Optional<EmployeePojo> empid=empdao.findById(id);
		return empid.get();
	}
    public void updateEmployee(EmployeePojo emp) {
    	empdao.save(emp);
    }
    public void deleteEmployee(EmployeePojo emp) {
    	empdao.delete(emp);
    }
}
