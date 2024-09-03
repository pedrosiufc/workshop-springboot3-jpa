package com.educandoweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	//Criando dependência para repository
	@Autowired //fazendo a injeção de dependência
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
