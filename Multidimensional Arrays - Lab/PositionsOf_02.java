package MultidimensionalArraysLab;

import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        boolean isFound = false;

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == num){
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
        }

    }
}
