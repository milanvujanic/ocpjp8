package com.milan.java8newfeatures.designinganinterface;

public interface Walk {
    boolean isQuadruped();
    abstract double getMaxSpeed();

    default void printSomething() {
        System.out.println("Walk -> printSomething()");
    }
}
