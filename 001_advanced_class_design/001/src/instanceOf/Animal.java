package instanceOf;

import java.sql.SQLOutput;

public abstract class Animal {

    protected String name = "???";

    public void printName() {
        System.out.println("Animal's name is: " + name);
    }
    public abstract void feed();

    private void printSomething() {
        System.out.println("Something!");
    }
}
