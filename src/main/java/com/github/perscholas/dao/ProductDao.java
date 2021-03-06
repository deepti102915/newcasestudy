package com.github.perscholas.dao;

import com.github.perscholas.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class ProductDao {
    private List<Product> productList;
    public List<Product> getProductList(){
        Product product1 =new Product();
        product1.setProductName("iPhone8 Plus");
        product1.setProductCategory("iPhone");
        product1.setProductDescription("This is new iphone8 Plus");
        product1.setProductPrice(600.00);
        product1.setProductCondition("This is new arrival");
        product1.setProductStatus("Active");
        product1.setUnitInStock(20);
        product1.setProductManufacturer("Apple");

        Product product2 =new Product();
        product2.setProductName("iPhonex");
        product2.setProductCategory("iPhone");
        product2.setProductDescription("This is new iphone8 Plus");
        product2.setProductPrice(1200.00);
        product2.setProductCondition("This is new arrival");
        product2.setProductStatus("Active");
        product2.setUnitInStock(20);
        product2.setProductManufacturer("Apple");

        Product product3 =new Product();
        product3.setProductName("Samsung S3");
        product3.setProductCategory("Samsung");
        product3.setProductDescription("This is new Samsung Mobile");
        product3.setProductPrice(900.00);
        product3.setProductCondition("This is new arrival");
        product3.setProductStatus("Active");
        product3.setUnitInStock(20);
        product3.setProductManufacturer("Samsung");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }
}
