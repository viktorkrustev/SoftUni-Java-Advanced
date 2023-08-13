package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        int sum = num1 + num2;
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i < num1; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            set1.add(num);
        }

        for (int i = 0; i < num2; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            set2.add(n);
        }

        set1.retainAll(set2);
        set1.forEach(el ->System.out.print(el + " "));
    }
}
