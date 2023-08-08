package MultidimensionalArraysLab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());;
        int cols = Integer.parseInt(scanner.nextLine());;
        String[][] matrix1 = new String[rows][cols];
        String[][] matrix2 = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = numbers[j];
            }
        }

        for (int i = 0; i < rows; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = numbers[j];
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String currentMatrix1 = matrix1[i][j];
                String currentMatrix2 = matrix2[i][j];
                if (!currentMatrix1.equals(currentMatrix2)){
                    System.out.print("* ");
                } else {
                    System.out.print(currentMatrix1 + " ");
                }
            }
            System.out.println();
        }

    }
}
