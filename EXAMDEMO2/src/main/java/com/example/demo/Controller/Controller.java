package com.example.demo.Controller;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Repository.Userrepo;
import com.example.demo.dto.validation;
import com.example.demo.exception.exception;



@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private Userrepo userrep;
	
	@PostMapping("/create")
	public ResponseEntity<User> create(@RequestBody @Valid  validation validate)
	{
		User user = new User(0,validate.getName(),validate.getAge());
		return ResponseEntity.ok().body(userrep.save(user));
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> get(@PathVariable int id)
	{
		Optional <User> optemp = userrep.findById(id);
	if(optemp!=null)
	{
		return ResponseEntity.ok().body(optemp.get());
	}
	else
	{
		return ResponseEntity.noContent().build();
	}
	
	}
	
	
	
	
	
	@DeleteMapping("/delete/{id}") 
	public ResponseEntity<Boolean> delete(@PathVariable int id)throws exception
	{
		Optional<User> optemp=userrep.findById(id);
		if(optemp.isPresent())
		{
			userrep.deleteById(id);
			return ResponseEntity.ok().body(true);
		}
		else
		{
			throw new exception("error");
		}
	}
	
	
	
	
	
	@PutMapping("/put/{id}")
	public ResponseEntity<User>  update(@RequestBody @Valid validation validate ,@PathVariable int id)
	{
//		User u=null;
		Optional<User> optemp = userrep.findById(id);
		if(optemp.isPresent())
		{
			
//			u=optemp.get();
//			u.setId(user.getId());
//			u.setAge(user.getAge());
//			u.setName(u.getName());
			User user = new User(0,validate.getName(),validate.getAge());
			userrep.save(user);
			return ResponseEntity.ok().body(user);
		}
		else
		{
			return ResponseEntity.noContent().build();
		}
	}

}
