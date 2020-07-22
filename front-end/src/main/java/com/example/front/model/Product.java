package com.example.front.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

  private Long id;
  private String name;
  private BigDecimal price;

  public Product() {
  }
}
