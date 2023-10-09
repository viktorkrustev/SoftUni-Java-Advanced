package Exams.JavaAdvancedRetakeExam_14December2022;

import java.util.Scanner;

public class NavyBattle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];
        fillMatrix(n, matrix, scanner);

        //find S
        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("S")){
                    startRow = i;
                    startCol = j;
                }
            }
        }

        int countC = 3;


        int mines = 0;
        int currentRow = startRow;
        int currentCol = startCol;

        String command = scanner.nextLine();

        while (true){
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

            if (matrix[currentRow][currentCol].equals("*")){
                mines++;
                matrix[currentRow][currentCol] = "-";
                matrix[previousRow][previousCol] = "-";
                if (mines == 3){
                    matrix[currentRow][currentCol] = "S";
                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", currentRow, currentCol);
                    printMatrix(matrix);
                    return;
                }
            } else if (matrix[currentRow][currentCol].equals("C")) {
                countC--;
                matrix[previousRow][previousCol] = "-";
                matrix[currentRow][currentCol] = "-";
                if (countC == 0){
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    matrix[currentRow][currentCol] = "S";
                    printMatrix(matrix);
                    return;
                }

            } else {
                matrix[previousRow][previousCol] = "-";
                matrix[currentRow][currentCol] = "S";
            }

            command = scanner.nextLine();
        }


    }
    public static void fillMatrix(int n, String[][] matrix, Scanner scanner){
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
        }
    }

    public static void printMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
