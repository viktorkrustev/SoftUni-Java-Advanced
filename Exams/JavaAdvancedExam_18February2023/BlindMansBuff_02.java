package Exams.JavaAdvancedExam_18February2023;

import java.util.Scanner;

public class BlindMansBuff_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);
        String[][] matrix = new String[rows][cols];
        fillMatrix(rows, matrix, scanner);

        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("B")){
                    startRow = i;
                    startCol = j;
                }
            }
        }

        int opponentsTouched = 0;
        int movesCount = 0;
        int opponents = 3;


        int currentRow = startRow;
        int currentCol = startCol;

        String command = scanner.nextLine();
        while (!command.equals("Finish")){
            int previousRow = currentRow;
            int previousCol = currentCol;

            switch (command){
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
            }

            if (opponentsTouched == opponents){
                break;
            }
            if (currentRow<0 || currentRow>=rows || currentCol<0 || currentCol>=cols){
                currentRow = previousRow;
                currentCol = previousCol;
            }

            String currentEl = matrix[currentRow][currentCol];
            
            if (currentEl.equals("O")){
                currentRow = previousRow;
                currentCol = previousCol;
            } else if (currentEl.equals("P")) {
                movesCount++;
                matrix[currentRow][currentCol] = "B";
                opponentsTouched++;
                matrix[previousRow][previousCol] = "-";
            } else if (currentEl.equals("-")) {
                matrix[currentRow][currentCol] = "B";
                matrix[previousRow][previousCol] = "-";
                movesCount++;
            }
            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d", opponentsTouched, movesCount);

    }
    public static void fillMatrix(int rows, String[][] matrix, Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().split(" ");
            matrix[i] = elements;
        }
    }
}
