package Exams.JavaAdvancedExam_17June2023;

import java.util.Scanner;

public class MouseInTheKitchen_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(",");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);
        String[][] matrix = new String[rows][cols];
        fillMatrix(rows, cols, matrix, scanner);
        int startRow = -1;
        int startCol = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("M")){
                    startRow = i;
                    startCol = j;
                }
            }
        }
        int countC = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("C")){
                    countC++;
                }
            }
        }

        String direction = scanner.nextLine();
        while (!direction.equals("danger")){
            int currentRow = startRow;
            int currentCol = startCol;
            switch (direction){
                case "up":
                    startRow--;
                    break;
                case "down":
                    startRow++;
                    break;
                case "left":
                    startCol--;
                    break;
                case "right":
                    startCol++;
                    break;
            }
            if (!isInRange(startRow, startCol, rows, cols)){
                System.out.println("No more cheese for tonight!");
                printMatrix(rows, cols, matrix);
                return;
            }

            if (matrix[startRow][startCol].equals("C")){
                countC--;
                if (countC == 0){
                    System.out.println("Happy mouse! All the cheese is eaten, good night!");
                    matrix[currentRow][currentCol] = "*";
                    matrix[startRow][startCol] = "M";
                    printMatrix(rows, cols, matrix);
                    return;
                } else {
                    matrix[startRow][startCol] = "M";
                    matrix[currentRow][currentCol] = "*";
                }
            }
            if (matrix[startRow][startCol].equals("T")) {
                System.out.println("Mouse is trapped!");
                matrix[currentRow][currentCol] = "*";
                matrix[startRow][startCol] = "M";
                printMatrix(rows, cols, matrix);
                return;
            }

            if (matrix[startRow][startCol].equals("@")) {
                startRow = currentRow;
                startCol = currentCol;
            }
            matrix[currentRow][currentCol] = "*";
            matrix[startRow][startCol] = "M";


            direction = scanner.nextLine();
        }
        System.out.println("Mouse will come back later!");
        matrix[startRow][startCol] = "M";
        printMatrix(rows, cols, matrix);


    }
    public static void fillMatrix(int rows, int cols, String[][] matrix,Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String[] chars = scanner.nextLine().split("");
            matrix[i] = chars;
        }
    }
    public static boolean isInRange(int row, int col, int matrixRols, int matrixCols){
        if (row>=0 && row<=matrixRols - 1 && col>=0 && col<=matrixCols - 1){
            return true;
        }
        return false;
    }
    public static void printMatrix(int rows, int cols, String[][] matrix){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
