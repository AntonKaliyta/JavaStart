package org.example.lesson2.ClassWork;


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int res[] = numSum(array);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    /**
     * @apiNote Найти сумму всех элементов, каждый слудующий элемент - сумма всех предудущих
     * @param array массив чисел
     * @return массив чисел
     */
    private static int[] numSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
