package com.example.front.controller;

import com.example.front.clients.ProductClient;
import com.example.front.model.Product;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "productController")
@ELBeanName(value = "productController")
@Join(path = "/product", to = "/product/product-form.jsf")
public class ProductController {
	@Autowired
  private ProductClient productClient;

	private Product product = new Product();

	public String save() {
		Product p = product;
    productClient.save(p);
		product = new Product();
		return "/product/product-list.xhtml?faces-redirect=true";
	}

	public Product getProduct() {
		return product;
	}
}
