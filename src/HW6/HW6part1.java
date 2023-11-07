package HW6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW6part1 {
    public static void main(String[] args) {
////        1) Пользователь задает размерность двумерного массива с клавиатуры.
////                Массив заполняется случайными числами от 0 до 1000.
////        Необходимо создать одномерный массив, состоящий из максимальных значений
////        каждого отдельного массива входящего в двумерный.
////        Новый полученный массив вывести на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер 1ого массива");
        int array1 = scanner.nextInt();
        System.out.println("введите размер 2ого массива");
        int array2 = scanner.nextInt();
        int[][] bigArray = new int[array1][array2];
        Random random = new Random();
        for (int i = 0; i < array1; i++) {
            for (int x = 0; x < array2; x++) {
                bigArray[i][x] = random.nextInt(0, 1000);
            }
        }
        System.out.println(Arrays.deepToString(bigArray));

        int[] maxValues = new int[array1];
        for (int i = 0; i < array1; i++) {
            int max = bigArray[i][0];
            for (int j = 1; j < array2; j++) {
                if (bigArray[i][j] > max) {
                    max = bigArray[i][j];
                }
            }
            maxValues[i] = max;
        }
            for (int i = 0; i < array2; i++) {
                System.out.print(maxValues[i] + " ");


            }


        }
    }




