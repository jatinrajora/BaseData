package com.traveldock;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user")
public class SignUpController {
	
	@PostMapping(path = "/signup")
	public void signUp(@RequestParam String email, String password) {
		
	}
}
