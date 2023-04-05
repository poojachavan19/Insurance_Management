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
import com.project.repository.ClientRepository;

@RestController
public class ClientController 
{
  @Autowired
  ClientRepository cr;
  
  //Create a new client.
  @PostMapping("/saveClient")
  public String saveClientData(@RequestBody Client c)
  {
	  cr.save(c);
	  return "Client Data is saved";
  }
  
  // Fetch a specific Client by id
  @GetMapping("/getClient")
  public Client getClientData(@RequestParam int id)
  {
	  Optional<Client> o=cr.findById(id);
	  return o.get();
  }
  
  //Fetch all Clients 
  @GetMapping("/getAllClient")
  public List<Client> getAll()
  {
	 return cr.findAll();
  }
  
  //Update a client's information
  @PutMapping("/updateClient")
  public String updateData(@RequestBody Client c)
  {
	  cr.save(c);
	  return "Data is updated";
  }
  
  //Delete a client
  @DeleteMapping("/delClient")
  public String delData(@RequestParam int id)
  {
	  cr.deleteById(id);
	  return "Data is deleted";
  }
  
  
  
  
}
