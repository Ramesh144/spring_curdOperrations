package com.example.demo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user;
import com.example.demo.repostory.userRepository;

@Service
public class userServer {
@Autowired	
 private userRepository userRepository;
public user addNewuser(user User) {
	user Userr=userRepository.save(User);
	return Userr;
}
}
