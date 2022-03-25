package instanceOf;

public class Cow extends Animal {

    protected String name = "Cow";

    @Override
    public void feed() {
        addHay();
    }

//    @Override
//    public void printName() {
//        System.out.println("Cow's name is: " + name);
//    }

    private void addHay() {
        System.out.println("Cow: Add hay!");
    }
}
