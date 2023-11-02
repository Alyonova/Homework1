package HW4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4part6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(array));
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
            System.out.println(min);
            System.out.println(max);

}}
