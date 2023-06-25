package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.awsentity;
import com.example.demo.Repository.awsIface;

@Service
public class awsservice {
	@Autowired
	private awsIface Awsiface;

	public  String create(awsentity awsentity) {
		// TODO Auto-generated method stub
		 Awsiface.save(awsentity);
		 return "true";
	}

	public String delete(int id)
	{
		
		Awsiface.deleteById(id);
		return "deleted";
	}

	

	public List<awsentity> rall() {
		// TODO Auto-generated method stub
		return Awsiface.findAll();
	}

	public awsentity rid(int id) {
		// TODO Auto-generated method stub
		return Awsiface.findById(id).orElse(null);
	}

	public awsentity put(awsentity awsentity) {
		awsentity aws = null;
		//Optional:to check if id exist or not
		Optional<awsentity> optemp = Awsiface.findById(awsentity.getId());
		if(optemp.isPresent())
		{
			aws=optemp.get();
			aws.setName(awsentity.getName());
			aws.setAge(awsentity.getAge());
			aws.setDescription(awsentity.getDescription());
		    Awsiface.save(aws);
		}
		else
		{
			
			Awsiface.save(awsentity);
			return awsentity;
		}
		return aws;
	}

	

	

	



}
