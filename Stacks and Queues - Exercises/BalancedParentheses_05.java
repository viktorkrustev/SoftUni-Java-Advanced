package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> openBracketStack = new ArrayDeque<>();
        boolean isValid = false;

        for (char symbol:input.toCharArray()){
            if (symbol == '(' || symbol == '[' || symbol == '{'){
                openBracketStack.push(symbol);
            } else {
                char open = ' ';
                if (!openBracketStack.isEmpty()){
                    open = openBracketStack.pop();
                }

                if (open == '(' && symbol == ')'){
                    isValid = true;

                } else if (open == '[' && symbol == ']') {
                    isValid = true;

                } else if (open == '{' && symbol == '}') {
                    isValid = true;

                } else {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
