package com.example.java2022homework4.Inheritance;

public class Product {
    public Product(int id){
        System.out.println("Yapıcı blok çalıstı");
    }

    public Product(){

    }
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
