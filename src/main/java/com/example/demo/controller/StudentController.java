package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repo.UserReop;

@RestController
public class StudentController {

	@Autowired
	UserReop userRepo;

	@RequestMapping("/student")
	public String getStudent() {
		User u = new User();
		u.setUserId(101);
		u.setUserName("ranjit");
		u.setUserCity("patna");
		userRepo.save(u);

		userRepo.findAll();
		return userRepo.findAll().toString();
	}

	@PostMapping("/student")
	public String addStudent() {

		User user = new User();
		user.setUserId(102);
		user.setUserName("ajit");
		user.setUserCity("delhi");

		userRepo.save(user);
		System.out.println(user);
		return "saved";
	}

}
