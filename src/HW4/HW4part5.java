package HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4part5 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i< array.length;i++) {
            array[i] = random.nextInt(200);
        }

            System.out.println(Arrays.toString(array));
            Scanner scanner = new Scanner(System.in);
           System.out.println("Insert number");
           int number = scanner.nextInt();
           boolean searchresult = false;
           for (int value : array) {
            if (number == value) {
                searchresult = true;
                break;
            }
        }
               if (searchresult == true){
                   System.out.println("такое число есть в массиве");
               } else {
                   System.out.println("такого числа нет в массиве");
               }
    }}