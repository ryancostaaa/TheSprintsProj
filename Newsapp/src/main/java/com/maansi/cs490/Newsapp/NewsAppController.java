package com.maansi.cs490.Newsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NewsAppController {

	@GetMapping("/welcome")
	public String test() {
		return "Hi this is Maansi";
	}
	
	@GetMapping("/usermodel")
	public UserModel userModel()  {
		return new UserModel();
	}
	
	@GetMapping("/signup")
	public UserModel signUp(@RequestParam(value="username") String username, 
			@RequestParam(value="firstname") String fname,
			@RequestParam(value="lastname") String lname,
			@RequestParam(value="email") String email,
			@RequestParam(value="password") String password) {
		return new UserModel(username, fname, lname, email, password);
	}
	@GetMapping("/signin")
	public UserModel signIn(@RequestParam(value= "username") String username,
			@RequestParam(value= "password") String password) {
		return UserModel(username, password);
	}
	
}