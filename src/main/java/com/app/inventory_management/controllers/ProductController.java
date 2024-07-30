package com.app.inventory_management.controllers;

import com.app.inventory_management.domain.Product;
import com.app.inventory_management.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8000/inventory-app
@RequestMapping("/inventory-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    //http://localhost:8000/inventory-app/products
    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = this.productService.listProducts();
        logger.info("Products obtained:");
        products.forEach((product -> logger.info(product.toString())));
        return products;
    }



}
