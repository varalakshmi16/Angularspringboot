package com.dsrc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsrc.bean.User;
import com.dsrc.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders ="*")
public class UserController {
@Autowired
	private UserRepository userRepository;

	
@GetMapping("/users")
public List<User> getUsers(){
	return userRepository.findAll();
}


@GetMapping("/user/{id}")
public User getUser(@PathVariable Long id){
	User usr=null;
			Optional<User> sd=userRepository.findById(id);
			if(sd.isPresent())			
				usr=sd.get();
			return usr; 
}


@DeleteMapping("/user/{id}")
public boolean deleteUser(@PathVariable Long id)
{
	
	///User usr=null;
	//Optional<User> sd=userRepository.deleteById(id);
	//if(sd.isPresent())			
	//	usr=sd.get();
	//return usr; 
	userRepository.deleteById(id);
	return true;
}



@PostMapping("/user")
public User createUser(@RequestBody User user) {
	return userRepository.save(user);
}



@PutMapping("/user")
public User updateUser(@RequestBody User user) {
	return userRepository.save(user);
}
}
