package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){
            if (!input.equals("cancel")){
                queue.offer(input);
            }
            if (queue.size()>0 && input.equals("cancel")){
                System.out.printf("Canceled %s%n",queue.poll());
            } else if (queue.size()==0 && input.equals("cancel")){
                System.out.println("Printer is on standby");
            }

            input = scanner.nextLine();
        }

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
