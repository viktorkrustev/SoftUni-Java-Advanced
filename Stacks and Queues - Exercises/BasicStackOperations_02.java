package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)){
            System.out.println("true");
        } else {
            if (stack.size()>0) {
                int minElement = Collections.min(stack);
                System.out.println(minElement);
            } else {
                System.out.println(0);
            }
        }

    }
}
