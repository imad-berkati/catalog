package com.ecommerce.catalog.domain.service;

import com.ecommerce.catalog.domain.model.ProductModel;
import com.ecommerce.catalog.domain.ports.application.ProductService;
import com.ecommerce.catalog.domain.ports.infrastructure.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public List<ProductModel> getAllProducts() {
    return productRepository.getAllProducts();
  }
}
