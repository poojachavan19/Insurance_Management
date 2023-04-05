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

import com.project.entity.Claims;
import com.project.entity.InsurancePolicy;
import com.project.repository.ClaimsRepository;
import com.project.repository.InsurancePolicyRepository;

@RestController
public class ClaimsController 
{
	 @Autowired
	  ClaimsRepository cpr;
	  
	  //Create a new Claims.
	  @PostMapping("/saveClaims")
	  public String saveData(@RequestBody Claims c)
	  {
		  cpr.save(c);
		  return "Claims Data is saved";
	  }
	  
	  // Fetch a specific Claims by id
	  @GetMapping("/getClaims")
	  public Claims getData(@RequestParam int id)
	  {
		  Optional<Claims> o=cpr.findById(id);
		  return o.get();
	  }
	  
	  //Fetch all Claims 
	  @GetMapping("/getAllClaims")
	  public List<Claims> getAll()
	  {
		 return cpr.findAll();
	  }
	  
	  //Update a Claims information
	  @PutMapping("/updateClaims")
	  public String updateData(@RequestBody Claims c)
	  {
		  cpr.save(c);
		  return "Data is updated";
	  }
	  
	  //Delete a Claims
	  @DeleteMapping("/delClaims")
	  public String delData(@RequestParam int id)
	  {
		  cpr.deleteById(id);
		  return "Data is deleted";
	  }
}
