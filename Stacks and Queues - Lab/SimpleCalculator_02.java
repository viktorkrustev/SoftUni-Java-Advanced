package StacksAndQueuesLab;

import java.util.*;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
        Collections.reverse(input);
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.size(); i++) {
            String currentSymbol = String.valueOf(input.get(i));

            stack.push(currentSymbol);
        }
        int sum = 0;

        int num1 = 0;
        int dequeSize = stack.size();
        for (int i = 0; i < dequeSize; i++) {
            if (i>=1){
                num1 = sum;
            } else {
                num1 = Integer.parseInt(stack.pop());
                dequeSize-=1;
            }
            String operation = stack.pop();
            dequeSize-=1;
            int num2 = Integer.parseInt(stack.pop());
            dequeSize-=1;

            if (operation.equals("+")){
                if (sum==num1){
                    sum+=num2;
                } else {
                    sum += num1+num2;
                }
            } else {
                if (sum==num1){
                    sum-=num2;
                }else {
                    sum-=Math.abs(num1-num2);
                }
            }


        }
        System.out.println(sum);

    }
}
