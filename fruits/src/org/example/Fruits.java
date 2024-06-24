package org.example;

public class Fruits {
    int price;
    String madeIn;
    String color;

    Fruits(int price,String madeIn,String color){
        this.price = price;
        this.madeIn = madeIn;
        this.color = color;
    }
    @Override
    public String toString(){
        return "果物の値段は" + this.price + "円です。";
    }
}