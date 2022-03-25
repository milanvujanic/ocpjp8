import instanceOf.Animal;
import instanceOf.Bird;
import instanceOf.Cow;
import instanceOf.Lion;

public class Main {

    public static void main(String[] args) {
        feedAnimal(new Cow());
        feedAnimal(new Lion());
        feedAnimal(new Bird());

        Animal cow = new Cow();
        cow.printName();
    }

    private static void feedAnimal(Animal animal) {
        animal.feed();
    }

}
