package com.shop.cart.exception;

public class CartNotFound extends Exception{
    private static final long serialVersionUID = 1L;

    public CartNotFound(String msg){
        super(msg);
    }
}
