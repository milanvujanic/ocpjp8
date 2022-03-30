package com.milan.java8newfeatures.designinganinterface;

public class Lion implements Run {
    @Override
    public boolean canHuntWhileRunning() {
        return true;
    }

    @Override
    public boolean isQuadruped() {
        return true;
    }

    @Override
    public double getMaxSpeed() {
        return 100;
    }

    public void printSomethingFromLion() {
        Run.super.printSomething();
    }
}
