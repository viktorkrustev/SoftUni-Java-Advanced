package Exams.JavaAdvancedExam_18February2023.kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child){
        if (registry.size() < this.capacity){
            this.registry.add(child);
            return true;
        }
        return false;
    }
    public boolean removeChild(String firstName){
        for (Child child : registry){
            if (child.getFirstName().equals(firstName)){
                this.registry.remove(child);
                return true;
            }
        }
        return false;
    }
    public int getChildrenCount(){
        return registry.size();
    }

    public Child getChild(String firstName){
        for (Child child : registry){
            if (child.getFirstName().equals(firstName)){
                return child;
            }
        }
        return null;
    }

    public String registryReport(){
        List<Child> sortedChildren = this.registry.stream()
                .sorted(Comparator.comparing(Child::getAge)
                .thenComparing(Child::getFirstName)
                .thenComparing(Child::getLastName))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        sb.append("Registered children in ").append(this.name).append(":").append(System.lineSeparator());

        for (Child child : sortedChildren){
            sb.append("--");
            sb.append(System.lineSeparator());
            sb.append(child).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
