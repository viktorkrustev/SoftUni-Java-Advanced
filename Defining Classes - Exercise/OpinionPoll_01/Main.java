package DefiningClassesExercises.OpinionPoll_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name  = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);
            peopleList.add(person);

        }

        List<Person> sortedList = peopleList.stream().filter(person -> person.age>30).sorted((p1, p2) -> p1.name.compareTo(p2.name))
                .collect(Collectors.toList());

        for (Person person:sortedList){
            System.out.println(person);
        }
    }
}
