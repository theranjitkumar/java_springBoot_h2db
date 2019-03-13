package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.repo.UserReop;

@Controller
public class UserController {
	@Autowired
	UserReop userRepo;

	@RequestMapping("/user")
	public ModelAndView users(ModelAndView mv) {
//		User u = new User();
//		u.setUserId(101);
//		u.setUserName("ranjit");
//		u.setUserCity("patna");
//		userRepo.save(u);

		List<User> users = new ArrayList<>();
		users = (List<User>) userRepo.findAll();
		mv.addObject("users", users);
	
		mv.setViewName("user");
		return mv;
	}

	
	
	@PostMapping("/user")
	public ModelAndView addUser(ModelAndView mv, @RequestParam String userName, @RequestParam String userCity) {
		User user = new User();
		user.setUserName(userName);
		user.setUserCity(userCity);

		userRepo.save(user);
		mv.setViewName("user");

		return mv;
	}

}
