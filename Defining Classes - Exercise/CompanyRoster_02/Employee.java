package DefiningClassesExercises.OpinionPoll_01.CompanyRoster_02;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;

    //optional
    private String email;
    private int age;


    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public String toString() {
        //"Peter 120.00  peter@abv.bg 28"
        return String.format("%s %.2f %s %d", name, salary, email, age);
    }
}
