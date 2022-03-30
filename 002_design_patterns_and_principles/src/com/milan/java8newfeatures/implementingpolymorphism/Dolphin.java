package com.milan.java8newfeatures.implementingpolymorphism;

public class Dolphin implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("Whistle");
    }
}
