package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("Samsung", "Galaxy 2", "2020", "Android", "2GB");

        SmartWatch smartWatch1 = new SmartWatch("Apple", "AppleWatch 2","2022","3'","15cm");

        System.out.println(smartPhone1.toString());

        System.out.println(smartWatch1.toString());
    }
}
