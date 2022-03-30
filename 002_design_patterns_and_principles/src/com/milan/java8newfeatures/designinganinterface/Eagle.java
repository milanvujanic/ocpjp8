package com.milan.java8newfeatures.designinganinterface;

public class Eagle implements Fly {

    @Override
    public int getWingSpan() {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
