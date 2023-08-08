package MultidimensionalArraysLab;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int rows1 = Integer.parseInt(data[0]);
        int cols1 = Integer.parseInt(data[1]);
        int[][] matrix1 = new int[rows1][cols1];

        for (int rows = 0; rows < rows1; rows++) {
            String[] values = scanner.nextLine().split(" ");
            for (int columns = 0; columns < cols1; columns++) {
                matrix1[rows][columns] = Integer.parseInt(values[columns]);
            }
        }

        String[] tokens = scanner.nextLine().split(" ");

        int rows2 = Integer.parseInt(tokens[0]);
        int cols2 = Integer.parseInt(tokens[1]);

        int[][] matrix2 = new int[rows2][cols2];

        for (int rows = 0; rows < rows2; rows++) {
            String[] nums = scanner.nextLine().split(" ");
            for (int columns = 0; columns < cols2; columns++) {
                matrix2[rows][columns] = Integer.parseInt(nums[columns]);
            }
        }


        if (rows1!=rows2 || cols2!=cols1){
            System.out.println("not equal");
            return;
        }
        boolean isValid = true;

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                if (matrix1[i][j] != matrix2[i][j]){
                    isValid = false;
                    break;
                }
            }
            if (!isValid){
                break;
            }
        }

        if (isValid){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
