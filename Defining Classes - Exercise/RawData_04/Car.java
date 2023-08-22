package DefiningClassesExercises.ex_04;

import java.util.List;

public class Car {
    private String name;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tiresList;

    public Car(String name, Engine engine, Cargo cargo, List<Tire> tiresList) {
        this.name = name;
        this.engine = engine;
        this.cargo = cargo;
        this.tiresList = tiresList;
    }

    public List<Tire> getTiresList() {
        return tiresList;
    }

    public void extract(String input){
        if (input.equals("fragile")){
            for (Tire tire:tiresList){
                if (tire.getPressure() < 1){
                    System.out.println(name);
                    break;
                }
            }
        } else {
            if (engine.getEnginePower() > 250) {
                System.out.println(name);
            }

        }
    }
}
