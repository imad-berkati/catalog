package com.ecommerce.catalog.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductModel {

  private Integer id;

  private String name;

  private double price;
}
