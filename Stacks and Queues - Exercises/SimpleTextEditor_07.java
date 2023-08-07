package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder stringBuilder = new StringBuilder();

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            if (command.startsWith("1")){
                String text = tokens[1];
                stringBuilder.append(text);
                stack.push(stringBuilder.toString());
            } else if (command.startsWith("2")) {
                int count = Integer.parseInt(tokens[1]);
                int startIndex = stringBuilder.length() - count;
                int endIndex = stringBuilder.length();

                stringBuilder.delete(startIndex, endIndex);
                stack.push(stringBuilder.toString());
            } else if (command.startsWith("3")) {
                int position = Integer.parseInt(tokens[1]);
                int index = position - 1;
                if (index<stringBuilder.length()){
                    System.out.println(stringBuilder.toString().charAt(index));
                }
                
            } else if (command.startsWith("4")) {
                stack.pop();
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(stack.peek());

            }
        }
    }
}
