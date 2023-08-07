package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            stack.push(num);

        }

        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }
}
