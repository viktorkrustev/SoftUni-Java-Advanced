package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")){
            if (stack.size()<=1 && input.equals("back")){
                System.out.println("no previous URLs");
                input = scanner.nextLine();
                continue;
            }
            if (input.equals("back")){
                stack.pop();
                System.out.println(stack.peek());

            }else {
                System.out.println(input);
                stack.push(input);
            }


            input = scanner.nextLine();
        }
    }
}
