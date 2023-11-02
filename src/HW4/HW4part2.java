package HW4;

import java.util.Scanner;

public class HW4part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println(number);
        int number1 = number;
        int reverse = 0;

        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }

        if (number1 == reverse) {
            System.out.println("Введенное число является палиндромом.");
        } else {
            System.out.println("Введенное число не является палиндромом.");
        }
    }
}