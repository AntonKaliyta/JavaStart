package org.example.lesson2.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {2, 6, 5, 8, 5, 6, 2 };
        System.out.println(isPalindrome(array));
    }

    /**
     * @apiNote Проверить является ли массив чисел симметричным
     * @param array входной массив
     * @return результат проверки
     */
    private static boolean isPalindrome(int[] array) {
        int len = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[len - i]) return false;
        }
        return true;
    }
}
