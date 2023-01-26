package com.ecommerce.catalog.infrastructure.db;

import com.ecommerce.catalog.infrastructure.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDbRepository extends JpaRepository<Product, Integer> {
}
