package DefiningClassesLab._01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String brand = input.split(" ")[0];
            String model = input.split(" ")[1];
            int hp = Integer.parseInt(input.split(" ")[2]);

            Car car = new Car(brand, model, hp);
            System.out.println(car.toString());
        }
    }
}
