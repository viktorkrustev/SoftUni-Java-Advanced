package MultidimensionalArraysLab;

import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);
        System.out.println(rows);
        System.out.println(cols);

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            String[] nums = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                sum+=Integer.parseInt(nums[j]);
            }
        }
        System.out.println(sum);
    }
}
