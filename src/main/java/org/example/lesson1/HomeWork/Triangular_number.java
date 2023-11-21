package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Triangular_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(triangular_number(number));
        scanner.close();
    }

    private static int triangular_number(int n) {
        return n * ((n +1))/2;
    }
}
