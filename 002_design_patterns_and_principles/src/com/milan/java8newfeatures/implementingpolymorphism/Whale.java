package com.milan.java8newfeatures.implementingpolymorphism;

public class Whale implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("Sing");
    }
}
