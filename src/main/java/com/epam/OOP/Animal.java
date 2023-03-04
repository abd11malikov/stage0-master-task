package com.epam.OOP;

public class Animal {
  private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    String  getDescription(){
        String a = "";
        if (hasFur)a="a";
        else a="no";
        return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and "+a+" fur.";
    }
}
