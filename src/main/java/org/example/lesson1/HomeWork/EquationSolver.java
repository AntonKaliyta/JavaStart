package org.example.lesson1.HomeWork;
import java.lang.Integer;

public class EquationSolver {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                int e = 69;
                String equation = q + "?" + " + " + "?" + w + " = " + e;
                if (isValidEquation(equation)) {
                    System.out.println("Решение: " + equation);
                    return;
                }
            }
        }
        System.out.println("Решение не найдено");
    }

    public static boolean isValidEquation(String equation) {
        String[] parts = equation.split("[+=]");
        int q = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1].substring(0, 1));
        int e = Integer.parseInt(parts[1].substring(1));
        return (q + w == e);
    }
}