package HW6;

import java.util.Random;
import java.util.Scanner;

public class HW6part2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char[][] gameField = {
                {'0', '1', '2', '3', '4', '5'},
                {'1', '-', '-', '-', '-', '-'},
                {'2', '-', '-', '-', '-', '-'},
                {'3', '-', '-', '-', '-', '-'},
                {'4', '-', '-', '-', '-', '-'},
                {'5', '-', '-', '-', '-', '-'}
        };
        int secretX = random.nextInt(1, 5);
        int secretY = random.nextInt(1, 5);
//        System.out.println(secretX);
//        System.out.println(secretY);
//        gameField[secretX][secretY] = 'x';

        for (char i = 0; i < gameField.length; i++) {
            for (char j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("All Set. Get ready to rumble!");
        int targetX, targetY;

        while (true) {
            System.out.println();
            System.out.println("Введите цель Х 1-5: ");
            targetX = scanner.nextInt();
            if (targetX < 1 || targetX > 5) {
                System.out.println("тупица, введи повторно ОТ 1 ДО 5: )");
                } else {
                System.out.println("Введите цель Y 1-5: ");
                targetY = scanner.nextInt();
                 if (targetY < 1 || targetY > 5) {
                     System.out.println("тупица, введи повторно ОТ 1 ДО 5: ");
                } else {
                     System.out.println("Не попал. Еще раз: ");
                     gameField[targetX][targetY] = '*';
                 }
                     for (char i = 0; i < gameField.length; i++) {
                         System.out.println();
                         for (char j = 0; j < gameField.length; j++) {
                             System.out.print(gameField[i][j] + " ");
                         }}
                         if ((targetX == secretX) && (targetY == secretY)) {
                             gameField[targetX][targetY] = 'x';
                             System.out.println();
                             System.out.println("В ЯБЛОЧКО :)");
                             break;
                         }
            }
        }
        for (char i = 0; i < gameField.length; i++) {
            System.out.println();
            for (char j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
                   }}
        System.out.println();
 System.out.println("YOU HAVE WON!");
    }}