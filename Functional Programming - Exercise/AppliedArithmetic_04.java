package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> add = list -> list.stream().map(num -> num+=1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = list -> list.stream().map(num -> num*=1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = list -> list.stream().map(num -> num-=1).collect(Collectors.toList());
        Consumer<List<Integer>> print = list -> list.forEach(num -> System.out.print(num + " "));

        String input = scanner.nextLine();
        while (!input.equals("end")){
            if (input.equals("add")){
                numbers = add.apply(numbers);
            } else if (input.equals("multiply")) {
                numbers = multiply.apply(numbers);
            } else if (input.equals("subtract")) {
                numbers = subtract.apply(numbers);
            }else {
                print.accept(numbers);
                System.out.println();
            }


            input = scanner.nextLine();
        }
    }
}
