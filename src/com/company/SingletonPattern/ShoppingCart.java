package com.company.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> products;
    private static ShoppingCart shoppingCart;
    private Integer id = 1899;
    private ShoppingCart() {
        products = new ArrayList<>();
    }

    public static synchronized ShoppingCart getInstance() {
        if(shoppingCart == null) {
            shoppingCart = new ShoppingCart();
        }

        return shoppingCart;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public List<String> getProducts() {
        return products;
    }

    public void displayCart() {
        System.out.println("The products in the cart are: ");
        for(String prod : this.products) {
            System.out.println(prod);
        }
    }
}
