package com.example.demo.contoller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user;
import com.example.demo.sevice.userServer;

@RestController

public class FirstContoller {
	@Autowired
	private userServer userServe;

	ArrayList<Integer> al = new ArrayList<Integer>();

	@RequestMapping("/home") // one API

	public String home() {

		String msg = "hello";

		return msg;

	}
	@PostMapping("/add")
public user add(@RequestBody user User) {
		user user1=userServe.addNewuser(User);
	return user1;
}
	

	}


