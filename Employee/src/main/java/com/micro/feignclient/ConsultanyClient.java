package com.micro.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.micro.Pojo.CompanyPojo;			







@FeignClient(name="api-gateway"	,url="http://localhost:8283/")
public interface ConsultanyClient {
	
	@GetMapping(value="/companydetails/user/{id}" ,produces="application/json")
	CompanyPojo getCompany(@PathVariable Integer id);

}
				