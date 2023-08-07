package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            switch (command){
                case "1":
                    int num = Integer.parseInt(tokens[1]);
                    stack.push(num);
                    break;
                case "2":
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                case "3":
                    if (!stack.isEmpty()){
                        int maxElement = Collections.max(stack);
                        System.out.println(maxElement);
                    }
                    break;
            }
        }

    }
}
