package com.blogging.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogging.payLoad.UserDto;
import com.blogging.services.UserService;
import com.google.gson.Gson;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {

	static Gson gson = new Gson();
	
	@Autowired
	UserService userService;

	// POST - Create user
	@PostMapping("/create")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		
		System.out.println( "email " +userDto.getEmail()==null);
		UserDto createUserDto = this.userService.createUser(userDto);
		
		return new ResponseEntity<UserDto>(createUserDto, HttpStatus.CREATED);

	}

	// Put -update user
	@PutMapping("/update/{id}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable Integer id) {

		UserDto updateUserDto = this.userService.updateUser(userDto, id);
		return new ResponseEntity<UserDto>(updateUserDto, HttpStatus.OK);

	}

	// DELETE - delete user
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {

		this.userService.deleteUser(id);
		return new ResponseEntity<>("Success", HttpStatus.OK);

	}
	// GET  get user by id 
    @GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserByID(@PathVariable Integer id) {

		UserDto userDto = this.userService.getUserByID( id);
		return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);

	}
    
    @GetMapping("/alluser")
	public ResponseEntity<List<UserDto>> getAllUser() {

    	List <UserDto> userDto = this.userService.getAllUser();
    	
		return new ResponseEntity<List<UserDto>>(userDto, HttpStatus.OK);

	}
    
}
