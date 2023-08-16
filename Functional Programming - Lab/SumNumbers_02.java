package FunctionalProgrammingLab;

import java.util.*;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).forEach(list::add);
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Count = " + list.size());
        System.out.println("Sum = " + sum);
    }
}
