package DefiningClassesExercises.OpinionPoll_01.CompanyRoster_02;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public double getAverageSalary() {
        double sumSalary = 0;
        for (Employee employee : employeeList) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employeeList.size();
    }
}
