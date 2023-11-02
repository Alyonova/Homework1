package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4part4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] numbers = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        String result = "%1$s будет идти в %2$s в %3$d:00";
        int first;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите числo от 0 до 6");
            int x = scanner.nextInt();
            first = x;
        } while (first < 0 || first > 6);
        System.out.println(names[first]);
        int second;
        do {
            System.out.println("Введите числo от 0 до 5");
            int y = scanner.nextInt();
            second = y;
        } while (second < 0 || second > 5);
        System.out.println(numbers[second]);
        int third;
        do {
            System.out.println("Введите числo от 0 до 5");
            int z = scanner.nextInt();
            third = z;
        } while (third < 0 || third > 5);
        System.out.println(places[third]);

        System.out.printf(result, names[first], places[third], numbers[second]);

    }
}