package MultidimensionalArraysExercises;

import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(scanner, matrix, rows, cols);

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String command = input.split(" ")[0];
            if (command.equals("swap")){
                int row1 = Integer.parseInt(input.split(" ")[1]);
                int col1 = Integer.parseInt(input.split(" ")[2]);
                int row2 = Integer.parseInt(input.split(" ")[3]);
                int col2 = Integer.parseInt(input.split(" ")[4]);
                if (isValidIndexes(row1, col1, row2, col2, rows, cols)){
                    String el = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = el;
                    printMatrix(matrix, rows, cols);

                } else {
                    System.out.println("Invalid input!");
                }

            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }

    }
    public static void fillMatrix(Scanner scanner, String[][] matrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = data[j];
            }
        }
    }

    public static boolean isValidIndexes(int row1,int col1,int row2, int col2, int rows, int cols){
        if (row1<0 || row1>=rows || col1<0 || col1>=cols || row2<0 || row2>=rows || col2<0 || col2>=cols){
            return false;
        }
        return true;
    }

    public static void printMatrix(String[][] matrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
