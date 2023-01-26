package com.ecommerce.catalog.domain.ports.application;

import com.ecommerce.catalog.domain.model.ProductModel;

import java.util.List;

public interface ProductService {

  List<ProductModel> getAllProducts();
}
