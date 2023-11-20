package org.example.lesson1.ClassWork;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));
    }

    /**
     * @apiNote Дано целое число , возвращает разность между произведением его цифр на сумму его цифр.
     * @param n заданное число
     * @return результат
     */
    private static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n != 0){
            product *= n % 10;
            sum += n % 10;
            n = n /10;
        }
        return product - sum;
    }
}
