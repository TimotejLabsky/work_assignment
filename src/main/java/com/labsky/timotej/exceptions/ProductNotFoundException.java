package com.labsky.timotej.exceptions;

/**
 * @author timotej
 */
public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        super("Product not found Exception " + message);
    }
}
