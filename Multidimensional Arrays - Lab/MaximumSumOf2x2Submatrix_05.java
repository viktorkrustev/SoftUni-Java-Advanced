package MultidimensionalArraysLab;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] nums = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }

        int maxSum = 0;
        int sum = 0;

        int rowIndex = -1;
        int colIndex = -1;

        boolean isFound = false;

        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                sum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if (sum>maxSum){
                    rowIndex = i;
                    colIndex = j;
                    maxSum = sum;
                    isFound = true;
                }
            }
        }

        if (isFound){
            System.out.print(matrix[rowIndex][colIndex] + " " + matrix[rowIndex][colIndex+1]);
            System.out.println();
            System.out.print(matrix[rowIndex+1][colIndex] + " " + matrix[rowIndex+1][colIndex+1]);
            System.out.println();
            System.out.println(maxSum);
        }
    }
}
