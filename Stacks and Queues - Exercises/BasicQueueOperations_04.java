package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.contains(x)){
            System.out.println("true");
        } else {
            if (queue.size()>0) {
                int minElement = Collections.min(queue);
                System.out.println(minElement);
            } else {
                System.out.println(0);
            }
        }

    }
}
