package MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        int n = Integer.parseInt(data[0]);
        String letter = data[1];
        int[][] matrix = new int[n][n];

        if (letter.equals("A")){
            fillA(matrix);
        } else {
            fillB(matrix);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void fillA(int[][] matrix){
        int startNum = 1;
        for (int cols = 0; cols < matrix.length ; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][cols] = startNum;
                startNum++;
            }

        }

    }
    public static void fillB(int[][] matrix){
        int startNum = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            if (cols%2==0){
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][cols] = startNum;
                    startNum++;
                }
            } else {
                for (int rows = matrix.length-1; rows >= 0; rows--) {
                    matrix[rows][cols] = startNum;
                    startNum++;

                }
            }

        }
    }
}
