package com.company.SingletonPattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String username = "Stephinie";
        WebAPI webAPI = new WebAPI(username);
        webAPI.createShoppingCart();
        webAPI.addInCart("bagpack");
        webAPI.addInCart("laptop");
        webAPI.render();
        webAPI.displayCartItems();

        MobileAPI mobileAPI = new MobileAPI(username);
        mobileAPI.createShoppingCart();
        mobileAPI.addInCart("decoration items");
        mobileAPI.addInCart("food items");
        mobileAPI.render();
        mobileAPI.displayCartItems();

        webAPI.removeFromCart("bagpack");
        mobileAPI.render();
        mobileAPI.displayCartItems();


    }
}
