package com.ecommerce.catalog.infrastructure.mapper;

import com.ecommerce.catalog.domain.model.ProductModel;
import com.ecommerce.catalog.infrastructure.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

  List<ProductModel> toModelList(List<Product> products);

}
