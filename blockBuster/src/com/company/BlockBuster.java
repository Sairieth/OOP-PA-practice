package com.company;

import com.company.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BlockBuster {
    private List<Product> products = new ArrayList<>();
    private List<Product> availableProducts = new ArrayList<>();
    private List<Product> isSellable = new ArrayList<>();
    private double revenue = 0.0;

    public boolean isProductAvailable(String name) {
        return availableProducts.stream().anyMatch(product -> product.getName().equals(name) || product.isAvailable());
    }

    public Set<Product> getSelectProducts() {
        return products.stream().filter(Product::isSelect).collect(Collectors.toSet());
    }

    public void addRevenue(double amount) {
        revenue += amount;
    }

    private Product getRentalProduct(String productName) {
        return products.stream().filter(product -> product.getName().equals(productName)).filter(Product::isAvailable).findFirst().get();
    }

    public void rent(int duration, String productName) {
        Product product = getRentalProduct(productName);
        availableProducts.remove(product);
        addRevenue(duration * product.getRentalPrice());
    }
}
