package MultidimensionalArraysExercises;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        String[][] matrix = new String[rows][columns];
        fillMatrix(matrix, rows, columns);
        printMatrix(matrix, rows, columns);


    }
    public static void fillMatrix(String[][] matrix, int rows, int cols){
        char ch = 'a';
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < cols; column++) {
                char letter = (char) (ch + column);
                String text = "" + (char)ch +  (char) letter + (char) (ch);
                matrix[row][column] = text;
            }
            ch++;
        }

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
