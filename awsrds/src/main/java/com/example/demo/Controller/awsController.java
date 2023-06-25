package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.awsentity;
import com.example.demo.Service.awsservice;



@RestController
@RequestMapping("/api/4.0")
public class awsController {

	@Autowired
	private awsservice Awsservice;
	
	@PostMapping("/create")
//	@RequestMapping(value=)
	public String addEmployee(@RequestBody awsentity awsentity )
	{
		return Awsservice.create(awsentity);
		
	}
	
	@DeleteMapping("/delete/{id}")
	//@RequestMapping()
	public String deleteEmployee(@PathVariable int id)
	{
		 
		 return Awsservice.delete(id);
	}
	@GetMapping("/retrieve/all")
	//@RequestMapping()
 public List<awsentity> getEmployee()
	{
		return Awsservice.rall();
	}
	
	@GetMapping("/retrieve/{id}")
	//@RequestMapping()
	public awsentity getEmployeebyid(@PathVariable int id){
		return Awsservice.rid(id);
	}
	
	 @PutMapping("/put")
	// @RequestMapping()
	 
	public awsentity updateEmployee(@RequestBody awsentity awsentity)
	{
		 return Awsservice.put(awsentity);
	}
	
	
	                                     
	
	

}
