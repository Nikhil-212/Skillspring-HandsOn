package com.cognizant.week4.entitymapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product { @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; @Column(name = "product_name", nullable = false) private String name; @Column(nullable = false) private double price; public Long getId() { return id; } public String getName() { return name; } public void setName(String name) { this.name = name; } public double getPrice() { return price; } public void setPrice(double price) { this.price = price; } }
