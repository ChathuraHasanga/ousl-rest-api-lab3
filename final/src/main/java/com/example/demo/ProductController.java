package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

	private final List<Product> products = List.of(
			new Product(1L, "Laptop", 12, new BigDecimal("1299.99")),
			new Product(2L, "Wireless Mouse", 45, new BigDecimal("29.99")),
			new Product(3L, "Mechanical Keyboard", 20, new BigDecimal("89.99")));

	@GetMapping
	public List<Product> getProducts() {
		return products;
	}
}
