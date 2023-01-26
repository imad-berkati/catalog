package com.ecommerce.catalog.domain.ports.infrastructure;

import com.ecommerce.catalog.domain.model.ProductModel;

import java.util.List;

public interface ProductRepository {

  List<ProductModel> getAllProducts();

}
