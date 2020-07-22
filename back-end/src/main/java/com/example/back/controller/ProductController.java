package com.example.back.controller;


import com.example.back.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

  private List<Product> products = new ArrayList<>();

  @RequestMapping(method = RequestMethod.GET, value = "/products")
  public List<Product> findAll(){
    return products;
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/products/{productId}")
  public void delete(@PathVariable("productId") Long productId){
    //do nothing
  }

  @RequestMapping(method = RequestMethod.POST, value = "/products", consumes = "application/json")
  public Product save(@RequestBody Product product){
    product.setId(Long.valueOf(products.size()));
    products.add(product);
    return product;
  }
}
