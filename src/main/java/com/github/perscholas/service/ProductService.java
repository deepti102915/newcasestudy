package com.github.perscholas.service;

import com.github.perscholas.model.Product;
import com.github.perscholas.model.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts(){
        List<Product> allProducts=new ArrayList<Product>();
        productRepo.findAll().forEach(s -> allProducts.add(s));
        return allProducts;
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }
}
