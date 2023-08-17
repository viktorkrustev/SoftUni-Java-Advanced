package FunctionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String> consumer = name -> System.out.println("Sir " + name);
        for (String name: names){
            consumer.accept(name);
        }
    }
}
