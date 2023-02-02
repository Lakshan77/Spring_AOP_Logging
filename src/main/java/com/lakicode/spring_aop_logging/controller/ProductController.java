package com.lakicode.spring_aop_logging.controller;

import com.lakicode.spring_aop_logging.model.Product;
import com.lakicode.spring_aop_logging.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public List<Product> saveProducts(@RequestBody List<Product> products){

        List<Product> pList = productService.addProduct(products);
        return pList;
    }

    @GetMapping("/findProducts")
    public List<Product> getProducts() {

        List<Product> products = productService.findAllProducts();
        return products;
    }
}
