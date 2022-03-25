package instanceOf;

public class Lion extends Animal {
    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat() {
        System.out.println("Lion: Add meat!");
    }
}
