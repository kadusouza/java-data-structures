package CarExercise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Car("Ford"));
        hashSetCarros.add(new Car("Chevrolet"));
        hashSetCarros.add(new Car("Fiat"));
        hashSetCarros.add(new Car("Peugeot"));
        hashSetCarros.add(new Car("Zip"));
        hashSetCarros.add(new Car("Alfa Romeo"));

        System.out.println(hashSetCarros);

        //Remember that the hashset does not guarantee the order of the elements
        //The treeset guarantees the order of the elements
        //But if the class does not implement the comparable interface, it will not be possible to order the elements
        //You will need to implement the comparable interface in the class
        //And implement(Override) the compareTo method to suit your needs
        Set<Car> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Car("Ford"));
        treeSetCarros.add(new Car("Chevrolet"));
        treeSetCarros.add(new Car("Fiat"));
        treeSetCarros.add(new Car("Peugeot"));
        treeSetCarros.add(new Car("Zip"));
        treeSetCarros.add(new Car("Alfa Romeo"));

        System.out.println(treeSetCarros);
    }
}