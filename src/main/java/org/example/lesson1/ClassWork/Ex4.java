package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(task4(a,b));
        scanner.close();
    }

    private static String task4(String a, String b) {
        if (a.length()<b.length()) return task4(b,a);
        int current = 0;
        int j = b.length()-1;
        String result = "";
        for (int i = a .length() - 1; 1 >=0;i--){
            if (a.charAt(i) == '1'){
                current++;
            }
            if (j >= 0 && b.charAt(i) == '1') {
                current++;
            }
            result = current %  2 + result;
            current /= 2;
            i--;
        }
//        if(current > 0){
//            result = current % 2 + result;
//        }
//        return result;
    }
}