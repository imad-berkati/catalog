package com.ecommerce.catalog.infrastructure.adapters;

import com.ecommerce.catalog.domain.model.ProductModel;
import com.ecommerce.catalog.domain.ports.infrastructure.ProductRepository;
import com.ecommerce.catalog.infrastructure.db.ProductDbRepository;
import com.ecommerce.catalog.infrastructure.entities.Product;
import com.ecommerce.catalog.infrastructure.mapper.ProductMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository {

  private final ProductDbRepository productDbRepository;

  private final ProductMapper productMapper;

  public ProductRepositoryImpl(ProductDbRepository productDbRepository, ProductMapper productMapper) {
    this.productDbRepository = productDbRepository;
    this.productMapper = productMapper;
  }

  @Override
  public List<ProductModel> getAllProducts() {

    List<Product> products = productDbRepository.findAll();
    return productMapper.toModelList(products);
  }
}
