package IteratorsAndComparatorsExercise.ListyIterator_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toList());

        ListyIterator listyIterator = new ListyIterator(names);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            switch (input) {
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;
                case "Print":
                    listyIterator.Print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
