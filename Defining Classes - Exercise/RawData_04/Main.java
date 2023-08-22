package DefiningClassesExercises.ex_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Car>> infoMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            Car car = new Car(model, engine, cargo, new ArrayList<>());

            for (int j = 5; j < data.length-1; j+=2) {
                double tyrePressure = Double.parseDouble(data[j]);
                int tyreAge = Integer.parseInt(data[j + 1]);
                Tire tire = new Tire(tyrePressure, tyreAge);
                car.getTiresList().add(tire);
            }

            if (!infoMap.containsKey(cargoType)) {
                List<Car> carsWithSameCargo = new ArrayList<>();
                carsWithSameCargo.add(car);
                infoMap.put(cargoType, carsWithSameCargo);
            } else {
                List<Car> carsWithSameCargo = infoMap.get(cargoType);
                carsWithSameCargo.add(car);
            }

        }
        String input = scanner.nextLine();
        for (Car car : infoMap.get(input)) {
            car.extract(input);
        }


    }
}
