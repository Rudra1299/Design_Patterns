package com.company.SingletonPattern;

import java.util.List;

public class MobileAPI {
    private String username;
    private ShoppingCart shoppingCart;
    public MobileAPI(String username) {
        this.username = username;
    }

    public ShoppingCart createShoppingCart() {
        shoppingCart = ShoppingCart.getInstance();
        return shoppingCart;
    }

    public void addInCart(String product) {
        this.shoppingCart.getProducts().add(product);
    }

    public void removeFromCart(String product) {
        this.shoppingCart.getProducts().remove(product);
    }
    public void render() {
        System.out.println("render mobile page");
    }

    public void displayCartItems() {
        this.shoppingCart.displayCart();
    }
}
