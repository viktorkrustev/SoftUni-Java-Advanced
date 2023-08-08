package MultidimensionalArraysLab;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndColumns = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndColumns][rowsAndColumns];

        for (int i = 0; i < rowsAndColumns; i++) {
            String[] nums = scanner.nextLine().split(" ");
            for (int j = 0; j < rowsAndColumns; j++) {
                matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }

        for (int i = 0; i < rowsAndColumns; i++) {
            for (int j = 0; j < rowsAndColumns; j++) {
                if (i == j){
                    System.out.print(matrix[i][j] + " ");

                }
            }
        }
        System.out.println();

        int n = 0;
        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = n; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
                break;
            }
            n++;
        }

    }
}
