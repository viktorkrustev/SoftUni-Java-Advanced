package FunctionalProgrammingExercises;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for (int num:nums){
            if (num%n!=0){
                stack.push(num);
            }
        }

        stack.forEach(num -> System.out.print(num + " "));

    }
}
