package com.app.inventory_management.services;

import com.app.inventory_management.domain.Product;
import java.util.List;

public interface IProductService {
    public List<Product> listProducts();

    public Product getProductById(Long idProduct);

    public void saveProduct(Product product);

    public void deleteProduct(Long idProduct);
}

