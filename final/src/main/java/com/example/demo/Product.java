package com.example.demo;

import java.math.BigDecimal;

public class Product {

	private final Long id;
	private final String name;
	private final int stockQuantity;
	private final BigDecimal price;

	public Product(Long id, String name, int stockQuantity, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.stockQuantity = stockQuantity;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
