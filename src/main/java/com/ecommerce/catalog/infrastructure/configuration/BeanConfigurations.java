package com.ecommerce.catalog.infrastructure.configuration;

import com.ecommerce.catalog.domain.ports.application.ProductService;
import com.ecommerce.catalog.domain.ports.infrastructure.ProductRepository;
import com.ecommerce.catalog.domain.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {

  @Bean
  public ProductService productServiceImpl(ProductRepository productRepository) {
    return new ProductServiceImpl(productRepository);
  }
}
