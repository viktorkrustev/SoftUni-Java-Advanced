package Exams.JavaAdvancedExam_17June2023.automotiveRepairShop;


import java.util.ArrayList;
import java.util.List;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        if (vehicles.size() < capacity){
            this.vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin){
        for (Vehicle vehicle : vehicles){
            if (vehicle.getVIN().equals(vin)){
                this.vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    public int getCount(){
        return vehicles.size();
    }

    public Vehicle getLowestMileage(){
        Vehicle lowestMileageVehicle = this.vehicles.get(0);
        for (Vehicle vehicle : vehicles){
            if (vehicle.getMileage() < lowestMileageVehicle.getMileage()){
                lowestMileageVehicle = vehicle;
            }
        }
        return lowestMileageVehicle;
    }

    public String report(){
        StringBuilder sb = new StringBuilder("Vehicles in the preparatory:\n");
        for (Vehicle vehicle : vehicles){
            sb.append(vehicle.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}


