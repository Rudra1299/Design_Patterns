package com.company.SingletonPattern;

import java.util.List;

public class WebAPI {

    private String username;
    private ShoppingCart shoppingCart;
    public WebAPI(String username) {
        this.username = username;
    }

    public void  createShoppingCart() {
        shoppingCart = ShoppingCart.getInstance();
    }

    public void addInCart(String product) {
        this.shoppingCart.getProducts().add(product);
    }

    public void removeFromCart(String product) {
        this.shoppingCart.getProducts().remove(product);
    }

    public void render() {
        System.out.println("render web page");
    }

    public void displayCartItems() {
        this.shoppingCart.displayCart();
    }

}
