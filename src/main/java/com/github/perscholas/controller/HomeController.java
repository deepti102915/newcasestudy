package com.github.perscholas.controller;

import com.github.perscholas.dao.ProductDao;
import com.github.perscholas.model.*;
import com.github.perscholas.service.DealService;
import com.github.perscholas.service.ItemService;
import com.github.perscholas.service.ProductService;
import com.github.perscholas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

//Test
@Controller

public class HomeController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProductService productService;

    Product product1 =new Product();
    Product product2 =new Product();
    Product product3 =new Product();
    Product product4 =new Product();

    @Autowired
    private DealRepo dealRepo;

    @Autowired
    private DealService dealService;

    Deal deal1 =new Deal();
    Deal deal2 =new Deal();

    @Autowired
    private ItemService itemService;
    Item item1 = new Item();

    @RequestMapping("/")
    public String welcome(Model model){
        product1.setProductId(1);
        product1.setProductName("iPhone8 Plus");
        product1.setProductCategory("iPhone");
        product1.setProductDescription("This is new iphone8 Plus");
        product1.setProductPrice(600.00);
        product1.setProductCondition("This is new arrival");
        product1.setProductStatus("Active");
        product1.setUnitInStock(20);
        product1.setProductManufacturer("Apple");

        product2.setProductId(2);
        product2.setProductName("iPhone X");
        product2.setProductCategory("iPhone");
        product2.setProductDescription("This is new iphone X Model");
        product2.setProductPrice(1200.00);
        product2.setProductCondition("This is new arrival");
        product2.setProductStatus("Active");
        product2.setUnitInStock(20);
        product2.setProductManufacturer("Apple");

        product3.setProductId(3);
        product3.setProductName("Samsung S3");
        product3.setProductCategory("Samsung");
        product3.setProductDescription("This is new Samsung Mobile");
        product3.setProductPrice(900.00);
        product3.setProductCondition("This is new arrival");
        product3.setProductStatus("Active");
        product3.setUnitInStock(20);
        product3.setProductManufacturer("Samsung");

        product4.setProductId(4);
        product4.setProductName("Master Bed Room Set");
        product4.setProductCategory("ValueCity");
        product4.setProductDescription("This is new Teak Wood Bed Room Set");
        product4.setProductPrice(2100.00);
        product4.setProductCondition("This is new arrival");
        product4.setProductStatus("Active");
        product4.setUnitInStock(20);
        product4.setProductManufacturer("Khadims");

        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
        productService.addProduct(product4);
        //Product
        List<Product> productList =productService.getAllProducts();
        model.addAttribute("products", productList);


        deal1.setId(1);
        deal1.setDealName("iPhone8 Plus");
        deal1.setDealCategory("iPhone");
        deal1.setDealDescription("This is new iphone8 Plus");
        deal1.setDealPrice1(600.00);
        deal1.setDealPrice(450.00);
        deal1.setDealCondition("This is new arrival");
        deal1.setDealStatus("Active");
        deal1.setUnitInStock(5);
        deal1.setDealManufacturer("Apple");

        deal2.setId(2);
        deal2.setDealName("iPhone X");
        deal2.setDealCategory("iPhone");
        deal2.setDealDescription("This is new iphone X Model");
        deal2.setDealPrice1(1200.00);
        deal2.setDealPrice(1100.00);
        deal2.setDealCondition("This is new arrival");
        deal2.setDealStatus("Active");
        deal2.setUnitInStock(5);
        deal2.setDealManufacturer("Apple");

        dealService.addDeal(deal1);
        dealService.addDeal(deal2);


        //Deal
        List<Deal> dealList =dealService.getAllDeals();
        model.addAttribute("deals", dealList);

        item1.setId(1);
        item1.setProductId(1);
        item1.setUserId(1);
        item1.setQuantity(2);
        item1.setProductName("iPhone8 Plus");
        item1.setProductPrice(600.00);
        //item1.setProduct(productService.find("1"));

        itemService.addDeal(item1);

        //item
        List<Item> itemList =itemService.getAllItems();
        model.addAttribute("carts", itemList);

        return "welcome";
    }

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

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
            //Product
            List<Product> productList =productService.getAllProducts();
            model.addAttribute("products", productList);

            //Deal
            List<Deal> dealList =dealService.getAllDeals();
            model.addAttribute("deals", dealList);

            //item
            List<Item> itemList =itemService.getAllItems();
            model.addAttribute("carts", itemList);

            return "loginconf";
        }
        System.out.println("User does not exist");
        model.addAttribute("error", "User not found, Kindly Register !!!");
        //Product
        List<Product> productList =productService.getAllProducts();
        model.addAttribute("products", productList);

        //Deal
        List<Deal> dealList =dealService.getAllDeals();
        model.addAttribute("deals", dealList);

        return "welcome";
    }

    @RequestMapping("/register")
    public String goToRegistrationPage(Model model){
        List<Product> productList =productService.getAllProducts();
        model.addAttribute("products", productList);

        //Deal
        List<Deal> dealList =dealService.getAllDeals();
        model.addAttribute("deals", dealList);
        return "register";
    }

    @RequestMapping("/set-user")
    public String addUser(@RequestParam("email") String email, @RequestParam("uname") String uName,
                          @RequestParam("password1") String password, Model model){
        User u = new User();
        //u.setId(id);
        u.setName(uName);
        u.setPassword(password);
        u.setEmail(email);
        userService.addUser(u);
        List<Product> productList =productService.getAllProducts();
        model.addAttribute("products", productList);

        //Deal
        List<Deal> dealList =dealService.getAllDeals();
        model.addAttribute("deals", dealList);
        return "welcome";
    }


}