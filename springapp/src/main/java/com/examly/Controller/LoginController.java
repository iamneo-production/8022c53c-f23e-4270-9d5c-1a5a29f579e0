package com.examly.springapp;


import java.util.List;

import javax.security.auth.spi.LoginModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController
public class LoginController 
{
    /*@GetMapping("/login")
	public String login(@RequestBody LoginModel registerModel)
	{
		
	        List<RegisterModel> users = (List<RegisterModel>) registerDao.findAll();
	        for (RegisterModel other : users) {
	            if (other.equals(registerModel)) {
	                registerModel.setLoggedIn(true);
	                registerDao.save(registerModel);
	                return "welcome.jsp";
	            }
	        }
	        return "error.jsp";
	    }
		*/  
}
