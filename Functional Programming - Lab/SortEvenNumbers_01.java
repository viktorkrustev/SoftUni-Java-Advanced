package FunctionalProgrammingLab;

import java.util.*;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0).boxed().toList());

        System.out.print(String.join(", ", list.toString()).replace("[","").replace("]",""));
        Collections.sort(list);
        System.out.println();
        System.out.print(String.join(", ",list.toString()).replace("[","").replace("]",""));

    }
}
