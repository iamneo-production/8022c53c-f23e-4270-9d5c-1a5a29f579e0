package com.examly.springapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController 
{
    @Autowired
        private UserService userService;

    @GetMapping("/userLogin")
	public void login(@RequestBody LoginModel loginModel)
	{
		userService.checkUser(loginModel);     
	}
    
}
