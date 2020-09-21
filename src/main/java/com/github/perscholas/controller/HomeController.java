package com.github.perscholas.controller;

import com.github.perscholas.dao.ProductDao;
import com.github.perscholas.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//Test
@Controller

public class HomeController {
    private ProductDao productDao = new ProductDao();

    @RequestMapping("/DShopping")
    public String welcome(Model model){
        List<Product> productList =productDao.getProductList();
        model.addAttribute("products", productList);
        return "welcome";
    }

    @RequestMapping("/DShopping/loginconf")
    public String loginconf(){
        return "loginconf";
    }
}