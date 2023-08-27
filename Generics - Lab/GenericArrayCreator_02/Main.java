package GenericsLab.GenericArrayCreator_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);

    }
}
