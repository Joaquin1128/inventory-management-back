package com.app.inventory_management.services;

import com.app.inventory_management.models.Product;
import com.app.inventory_management.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> listProducts() {
         return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(Long idProduct) {
        Product product = this.productRepository.findById(idProduct).orElse(null);
        return product;
    }

    @Override
    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long idProduct) {
        this.productRepository.deleteById(idProduct);
    }
}
