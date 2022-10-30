package com.example.java2022homework4.StaticDemo;

public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok çalıstı");

    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıstı");

    }
    public static boolean isValid(Product product){
        if(product.price>0 && product.name.isEmpty()){
            return true;
        }
        return false;
    }

    public void bisey(){
        //bu operasyonu kullanmak için newlemek gerekir
    }
}
