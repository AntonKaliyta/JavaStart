package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("task3() = " + task3(str));
    }

    /**\
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param str
     * @return a+b
     */
    private static String task3(String str) {
        String a = str.substring(0, str.length()/2);
        String b = str.substring(str.length()/2);
        return b + a;
    }
}
