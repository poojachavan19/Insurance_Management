package com.project.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Client;
import com.project.entity.InsurancePolicy;
import com.project.repository.ClientRepository;
import com.project.repository.InsurancePolicyRepository;

@RestController
public class InsurancePolicyController 
{
	 @Autowired
	  InsurancePolicyRepository ipr;
	  
	  //Create a new Policy.
	  @PostMapping("/savePolicy")
	  public String saveData(@RequestBody InsurancePolicy ip)
	  {
		  ipr.save(ip);
		  return "Policy Data is saved";
	  }
	  
	  // Fetch a specific Policy by id
	  @GetMapping("/getPolicy")
	  public InsurancePolicy getData(@RequestParam int id)
	  {
		  Optional<InsurancePolicy> o=ipr.findById(id);
		  return o.get();
	  }
	  
	  //Fetch all Policy 
	  @GetMapping("/getAllPolicy")
	  public List<InsurancePolicy> getAll()
	  {
		 return ipr.findAll();
	  }
	  
	  //Update a Policy information
	  @PutMapping("/updatePolicy")
	  public String updateData(@RequestBody InsurancePolicy ip)
	  {
		  ipr.save(ip);
		  return "Data is updated";
	  }
	  
	  //Delete a Policy
	  @DeleteMapping("/delPolicy")
	  public String delData(@RequestParam int id)
	  {
		  ipr.deleteById(id);
		  return "Data is deleted";
	  }
	  
}
