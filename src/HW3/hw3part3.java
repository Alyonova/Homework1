package HW3;

import java.util.Scanner;

public class hw3part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int difference = (a > b) ? (a - b) : (b - a);
        System.out.println("Разница:" + " " + difference);

    }
}
