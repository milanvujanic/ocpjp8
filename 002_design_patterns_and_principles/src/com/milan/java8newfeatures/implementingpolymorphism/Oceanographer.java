package com.milan.java8newfeatures.implementingpolymorphism;

import com.milan.java8newfeatures.implementingfunctionalinterfaceswithlambdas.Animal;

public class Oceanographer {
    public void checkSound(LivesInOcean animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Dolphin dolphin1 = DolphinSingleton.INSTANCE.getInstance();
        Dolphin dolphin2 = DolphinSingleton.INSTANCE.getInstance();
        System.out.println("Dolphin1: " + dolphin1);
        System.out.println("Dolphin2: " + dolphin2);
    }
}
