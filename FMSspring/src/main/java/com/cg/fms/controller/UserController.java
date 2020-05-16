package com.cg.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cg.fms.entity.User;

import com.cg.fms.exception.UserException;
import com.cg.fms.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("user/{id}")
	public ResponseEntity<User>  findUserId(@PathVariable("id") int id) throws UserException
	{
		User  users = userService.findUserId(id);
	
	   ResponseEntity<User>  us = new ResponseEntity<>(users,HttpStatus.OK);
	   return us;
	

	

			
		}
}
