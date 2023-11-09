package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		User usuario = new User();

		usuario.setNome("Diego");
		usuario.setLogin("123");
		usuario.setSenha("123");

		UserService.InserirUser(usuario);
	}

}
