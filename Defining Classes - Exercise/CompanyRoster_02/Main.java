package DefiningClassesExercises.OpinionPoll_01.CompanyRoster_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> infoMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];

            String email = "n/a";
            int age = -1;

            if (data.length==5){
                if (Character.isLetter(data[4].charAt(0))){
                    email = data[4];
                } else {
                    age = Integer.parseInt(data[4]);
                }
            } else if (data.length==6) {
                email = data[4];
                age = Integer.parseInt(data[5]);
            }

            Employee employee = new Employee(name, salary, position, department, email, age);
            infoMap.putIfAbsent(department, new Department(department));
            infoMap.get(department).getEmployeeList().add(employee);

        }
        Department maxAverageSalaryDepartment = infoMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getName());
        maxAverageSalaryDepartment.getEmployeeList()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
}
