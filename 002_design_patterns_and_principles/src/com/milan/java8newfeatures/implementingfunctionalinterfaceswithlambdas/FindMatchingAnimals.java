package com.milan.java8newfeatures.implementingfunctionalinterfaceswithlambdas;

import java.util.function.Predicate;

public class FindMatchingAnimals {
    private static void print(Animal animal, Predicate<Animal> predicate) {
        if (predicate.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("Fish", false, true), a -> a.canHop());
        print(new Animal("Kangaroo", true, false), a -> a.canHop());
    }
}
