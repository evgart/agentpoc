package com.example.front.clients;

import com.example.front.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("products")
public interface ProductClient {

  //@RequestMapping(method = RequestMethod.GET, value = "/products")
  @GetMapping("/products")
  List<Product> findAll();

  //@RequestMapping(method = RequestMethod.DELETE, value = "/products/{productId}")
  @DeleteMapping("/products/{productId}")
  void delete(@PathVariable("productId") Long productId);

  //@RequestMapping(method = RequestMethod.POST, value = "/products", consumes = "application/json")
  @PostMapping(value = "/products", consumes = "application/json")
  Product save(Product product);
}
