package org.example.lesson2.ClassWork;

import java.util.Scanner;

import static java.lang.Math.*;

public class ExPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int y = scanner.nextInt();
        System.out.print(pow(x,y));
        scanner.close();
    }
}
