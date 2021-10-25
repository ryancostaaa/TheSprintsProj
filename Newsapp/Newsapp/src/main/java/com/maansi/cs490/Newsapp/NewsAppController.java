package com.maansi.cs490.Newsapp;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsAppController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/welcome")
	public String test() {
		return "Hi this is Maansi";
	}

	@GetMapping("/usermodel")
	public UserModel userModel() {
		return new UserModel();
	}

	@GetMapping("/signup")
	public UserModel signUp(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password) {
		return new UserModel(userName, name, email, password);
	}
	/*
	 * @GetMapping("/login") public UserModel logIn(@RequestParam(value= "userName")
	 * String userName,
	 * 
	 * @RequestParam(value= "password") String password) { return new
	 * UserModel(userName, password); }
	 */

	@GetMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String userName,
			@RequestParam String password, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		tbl_signup n = new tbl_signup();
		n.setName(name);
		n.setUserName(userName);
		n.setPassword(password);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<tbl_signup> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}

	
	  @GetMapping(path="/login") 
	  public @ResponseBody String loginUser(@RequestParam String username, @RequestParam String password) { 
	  List<tbl_signup> t =  userRepository.findBypassword(username, password);
	  
	  if (t.size() <= 0) { return "Username/password incorrect"; } else {
	  return "User Logged in successfully"; }
	  
	  }
	 

}