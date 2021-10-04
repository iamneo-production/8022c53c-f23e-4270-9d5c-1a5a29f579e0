package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

	public String loginUser(UserModel userModel)
	{
	        List<UserModel> users = (List<UserModel>) userRepository.findAll();
	        for (UserModel um : users) {
	            if (um.equals(userModel)) 	               
	                return "success_page";   
	        }
	        return "Error_page";
	}

    

}
