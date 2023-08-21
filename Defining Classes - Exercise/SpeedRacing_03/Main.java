package DefiningClassesExercises.SpeedRacing_03;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelPriceForKm = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, fuelPriceForKm);
            carsMap.put(model, car);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String model = input.split(" ")[1];
            int km = Integer.parseInt(input.split(" ")[2]);
            if (!carsMap.get(model).drive(km)) {
                System.out.println("Insufficient fuel for the drive");
            }
            input = scanner.nextLine();
        }

        for (Car car: carsMap.values()){
            System.out.println(car);
        }
    }
}
