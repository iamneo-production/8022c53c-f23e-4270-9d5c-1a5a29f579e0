package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Service
public class UserService  {
    //implements UserDetailsService
    @Autowired
    private UserRepository userRepository;

   /* @Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserModel user=userRepository.findByEmail(email);
		if(user==null)
			throw new UsernameNotFoundException("User 404");
		return new UserDetail(user);
	}*/
	

    public void addUser(UserModel userModel){
        userRepository.save(userModel);  
    }

    public List<UserModel> getAll(){
        List<UserModel> l=new ArrayList<>();
        userRepository.findAll().forEach(l::add);
        return l;
    }
    public void checkUser(LoginModel loginModel){
        
    }
}
