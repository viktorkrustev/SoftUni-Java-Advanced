package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());

        Set<String> stringSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            for (String el:data){
                if (!stringSet.contains(el)){
                    stringSet.add(el);
                }
            }
        }

        for (String s : stringSet) {
            System.out.print(s + " ");
        }
    }
}
