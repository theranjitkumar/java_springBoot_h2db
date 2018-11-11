package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface UserReop extends CrudRepository<User, Integer> {
	

}
