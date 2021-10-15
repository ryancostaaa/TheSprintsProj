package com.maansi.cs490.Newsapp;

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
		return new UserModel(username, password);
	}
	
	 @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String name
	      , @RequestParam String email) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Tbl_signup n = new Tbl_signup();
	    n.setName(name);
	    n.setEmail(email);
	    userRepository.save(n);
	    return "Saved";
	  }
	 
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Tbl_signup> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	  }
	
}