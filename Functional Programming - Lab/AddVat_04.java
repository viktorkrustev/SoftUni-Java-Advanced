package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        Function<Double, Double> addVat = price -> price*1.2;

        Consumer<Double> printPrice = price -> System.out.printf("%.2f%n",price);
        System.out.println("Prices with VAT:");

        for (double price:list){
            double priceWithVat = addVat.apply(price);
            printPrice.accept(priceWithVat);
        }

    }
}
