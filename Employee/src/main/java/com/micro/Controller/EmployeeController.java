package com.micro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.Pojo.CompanyPojo;
import com.micro.Pojo.EmployeePojo;
import com.micro.Service.EmployeeService;
import com.micro.feignclient.ConsultanyClient;
import com.sun.net.httpserver.HttpsConfigurator;




@RestController
@RequestMapping("EmployeeDetails")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empser;
	
	
	
	@Autowired
	private ConsultanyClient client;
	
	
	@GetMapping("constid/{id}")
	  public ResponseEntity<CompanyPojo> getCompany(@PathVariable Integer id){
		  
	 CompanyPojo pojo=client.getCompany(id); 
	  return new ResponseEntity<CompanyPojo>(pojo,HttpStatus.OK); }
	
	@PostMapping("/add")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeePojo emp){
		empser.saveEmployee(emp);
		ResponseEntity<String> response= new ResponseEntity<String>("Sucess",HttpStatus.CREATED);
		
		return response;
	}
	@GetMapping("employee/{id}")
   public ResponseEntity<EmployeePojo> getEmployee(@PathVariable Integer id){
	 
	   EmployeePojo getemp=empser.getEmployee(id);
	return new ResponseEntity<EmployeePojo>(getemp,HttpStatus.OK);
	  
   }
   @PutMapping("/update")
   public ResponseEntity<String> updateEmployee(@RequestBody EmployeePojo emp){
	   empser.updateEmployee(emp);
	   
	  ResponseEntity<String> response= new ResponseEntity<String>("Updated",HttpStatus.OK);
	  return response;
   }
   @DeleteMapping
   public ResponseEntity<String> deleteEmployee(@RequestBody EmployeePojo emp){
	   empser.deleteEmployee(emp);
	  
	  ResponseEntity<String> response=new ResponseEntity<String>("Deleted Record",HttpStatus.OK);
	  return response;
   }
   
   
   
}
