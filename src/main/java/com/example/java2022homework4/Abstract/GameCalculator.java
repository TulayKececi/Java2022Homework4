package com.example.java2022homework4.Abstract;

public abstract class GameCalculator {
    //tüm oyuncular için hesapla olacak kkullanıcı türüne göre ovirride edecek
    //abstract new lenmez tek basına kullanılamaz
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println(" Oyun bitti");
    }

}
