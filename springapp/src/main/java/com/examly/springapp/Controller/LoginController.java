package com.examly.springapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController 
{
    @Autowired
        private UserService userService;

	@RequestMapping(method=RequestMethod.POST , value="/login")
	public boolean login(@RequestBody LoginModel loginModel){
		return userService.checkUser(loginModel);     
	}
    
}
