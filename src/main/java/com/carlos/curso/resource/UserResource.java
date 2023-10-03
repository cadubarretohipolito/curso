package com.carlos.curso.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(
				1L,
				"Carlos",
				"carlos@gmail.com",
				"992293319",
				"12311331");
		
		return ResponseEntity.ok(u);
		
	}
	
}
