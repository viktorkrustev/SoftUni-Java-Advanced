package MultidimensionalArraysExercises;

import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sumOfPrimary = sumPrimaryDiagonal(matrix);
        int sumOfSecondary = sumSecondaryDiagonal(matrix);
        int totalSum = Math.abs(sumOfPrimary - sumOfSecondary);
        System.out.println(totalSum);


    }
    public static int sumPrimaryDiagonal(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int element = matrix[i][i];
            sum+=element;
        }
        return sum;
    }

    public static int sumSecondaryDiagonal(int[][] matrix){
        int sum = 0;
        int lastEl = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
                int el = matrix[i][lastEl];
                sum+=el;
                lastEl--;

        }
        return sum;
    }
}
