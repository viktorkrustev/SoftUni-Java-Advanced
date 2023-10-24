package Exams.JavaAdvancedExam_25June2022;

import java.util.Arrays;
import java.util.Scanner;

public class StickyFingers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");
        String[][] matrix = new String[n][n];
        fillMatrix(matrix, n, scanner);

        //find D
        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("D")){
                    startRow = i;
                    startCol = j;
                }
            }
        }
        matrix[startRow][startCol] = "+";

        int currentRow = startRow;
        int currentCol = startCol;

        int totalMoney = 0;

        boolean isFinish = true;

        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];
            int previousRow = currentRow;
            int previousCol = currentCol;
            int money = 0;

            switch (currentCommand){
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "left":
                    currentCol--;
                    break;
            }

            if (currentCol < 0 || currentCol >= n || currentRow < 0 || currentRow >= n){
                currentRow = previousRow;
                currentCol = previousCol;
                System.out.println("You cannot leave the town, there is police outside!");
                continue;
            }

            String position = matrix[currentRow][currentCol];
            if (position.equals("$")){
                money = currentRow * currentCol;
                totalMoney+=money;
                System.out.printf("You successfully stole %d$.%n", money);
            } else if (position.equals("P")) {
                matrix[previousRow][previousCol] = "+";
                matrix[currentRow][currentCol] = "#";
                isFinish = false;
                break;
            }

            matrix[currentRow][currentCol] = "D";
            matrix[previousRow][previousCol] = "+";
        }

        if (isFinish){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoney);
        } else {
            System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoney);
        }
        printMatrix(matrix, n);



    }
    public static void fillMatrix(String[][] matrix, int n, Scanner scanner){
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
    }

    public static void printMatrix(String[][] matrix, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]).replace(",","").replace("[", "")
                    .replace("]",""));
        }
    }
}