package com.milan.java8newfeatures.implementingpolymorphism;

public enum DolphinSingleton {
    INSTANCE(new Dolphin());

    private Dolphin dolphin;

    DolphinSingleton(Dolphin dolphin) {
        this.dolphin = dolphin;
    }

    public Dolphin getInstance() {
        return this.dolphin;
    }
}
