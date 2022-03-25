package instanceofHippo;

public class Main {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        System.out.println(hippo instanceof Hippo);
        System.out.println(hippo instanceof HeavyAnimal);
        System.out.println(hippo instanceof Elephant);
        System.out.println(hippo instanceof Mother);
    }
}
