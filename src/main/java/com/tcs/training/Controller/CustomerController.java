package com.tcs.training.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.training.Entity.User;

import com.tcs.training.Service.UserService;

@RestController
@RequestMapping("/user")
public class CustomerController {

	@Autowired
    private UserService userService;
    //@Autowired
    //private ProductService productService;
    @GetMapping("/register")
    public String showCustomerRegisterPage(Model model) {
    	 model.addAttribute("error", null);
        return "customerregister";
    }
    @PostMapping("/register")
    public String processCustomerRegister(@RequestParam String username, 
                                  @RequestParam String password,@RequestParam String confirmpassword,
                                  Model model) {
        try {
            User user = userService.registerCustomer(username, password,confirmpassword);
            return "customerlogin";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "customerregister";
        }
    }
    @GetMapping("/login")
    public String showCustomerLoginPage(Model model) {
    	 model.addAttribute("error", null);
        return "customerlogin";
    }
 //   @PostMapping("/login")
//    public String processCustomerLogin(@RequestParam String username, 
//                                  @RequestParam String password,
//                                  Model model) {
//        try {
//            User user = userService.authenticateCustomer(username, password);
//            return "redirect:/user/dashboard";
//        } catch (RuntimeException e) {
//            model.addAttribute("error", e.getMessage());
//            return "customerlogin";
//        }
//    }
//    @GetMapping("/dashboard")
//    public String showCustomerDashboard(Model model) {
//    	 try {
//    	        List<Product> products = productService.allProducts();
//    	        model.addAttribute("products", products);
//    	        return "userDashboard";
//    	    } catch (Exception e) {
//    	        model.addAttribute("error", "Error loading products");
//    	        return "error"; //error page
//    	    }
//    }
    
}
