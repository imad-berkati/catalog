package com.ecommerce.catalog.application;

import com.ecommerce.catalog.domain.model.ProductModel;
import com.ecommerce.catalog.domain.ports.application.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Log4j2
public class ProductsController {

  private final ProductService productService;

  public ProductsController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public ResponseEntity<List<ProductModel>> getProducts() {
    log.info("Call get all products function");
    return ResponseEntity.ok(productService.getAllProducts());
  }


}
