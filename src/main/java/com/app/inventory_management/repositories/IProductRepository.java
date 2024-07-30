package com.app.inventory_management.repositories;

import com.app.inventory_management.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
