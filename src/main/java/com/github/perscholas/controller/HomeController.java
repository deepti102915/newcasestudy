package com.github.perscholas.controller;

import com.github.perscholas.dao.ProductDao;
import com.github.perscholas.model.Product;
import com.github.perscholas.model.ProductRepo;
import com.github.perscholas.model.User;
import com.github.perscholas.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Test
@Controller

public class HomeController {


    private ProductDao productDao = new ProductDao();

    @Autowired
    private ProductRepo productRepo;

    @RequestMapping("/")
    public String welcome(Model model){
        Product p = null;
        try{
            System.out.println("Product Name: " + productRepo.findAll());
        }catch(Exception e){
            System.out.println("Product Not found!!!");

        }
        List<Product> productList =productDao.getProductList();
        model.addAttribute("products", productList);
        return "welcome";
    }

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/loginconf")
    public String loginconf(@RequestParam("id") String id, @RequestParam("password") String password, Model model){
        User u = null;
        try{
            u=userRepo.findByName(id);
        }catch(Exception e){
            System.out.println("User Not found!!!");
            
        }
        if(u!=null) {
            System.out.println("User exist" + id);
            model.addAttribute("UserName", id);
            return "loginconf";
        }
        System.out.println("User does not exist");
        model.addAttribute("error", "User not found, Kindly Register !!!");
        return "welcome";
    }

    @RequestMapping("/register")
    public String goToRegistrationPage(){
        return "register";
    }

    @RequestMapping("/set-user")
    public String goToRegisterMicroService(){
        //TODO
        return "welcome";
    }
}