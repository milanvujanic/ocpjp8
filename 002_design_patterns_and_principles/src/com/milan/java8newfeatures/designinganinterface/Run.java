package com.milan.java8newfeatures.designinganinterface;

public interface Run extends Walk {
    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();
}
