package DefiningClassesExercises.SpeedRacing_03;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumptionFuelPerKm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double consumptionFuelPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumptionFuelPerKm = consumptionFuelPerKm;
        this.distanceTraveled = 0;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getConsumptionFuelPerKm() {
        return consumptionFuelPerKm;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public boolean drive(int kmDrive) {
        double needFuel = kmDrive * getConsumptionFuelPerKm();
        if (needFuel <= this.fuelAmount) {
            this.fuelAmount -= needFuel;
            this.distanceTraveled += kmDrive;
            return true;
        }
        return false;
    }
    public String toString() {
        return String.format("%s %.2f %d",this.model, this.fuelAmount, this.distanceTraveled);
    }
}
