package com.tcs.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.training.Entity.User;
import com.tcs.training.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository urepo;

	public User authenticateAdmin(String username, String password) {
        User user = urepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        
        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }
        
        if (!"ADMIN".equals(user.getRole())) {
            throw new RuntimeException("Access denied. Admin privileges required");
        }
        
        return user;
    }
	
	 public User authenticateCustomer(String username, String password) {
	        User user = urepo.findByUsername(username)
	                .orElseThrow(() -> new RuntimeException("User not found"));
	        
	        if (!user.getPassword().equals(password)) {
	            throw new RuntimeException("Invalid password");
	        }
	        
	        if (!"USER".equals(user.getRole())) {
	            throw new RuntimeException("Access denied. Customer account required");
	        }
	        
	        return user;
	    }

	public User registerCustomer(String username, String password, String confirmpassword) {
		// TODO Auto-generated method stub
		User user = new User(username,password,"USER");
		
        if(urepo.findByUsername(username).isPresent()) {
        	throw new RuntimeException("UserName Already Exists");
        }
        else if (!user.getPassword().equals(confirmpassword)) {
            throw new RuntimeException("Password does not matches");
        }else {
        	urepo.save(user);
    		
        }
        
        
        return user;
	}
		
	
}
