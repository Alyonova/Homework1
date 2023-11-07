package HW7;

import java.util.Arrays;

import java.util.Random;

public class HW7part1 {
//    1)
//    Написать метод, принимающий в качестве параметра массив целых чисел.
//    И выводит на экран все четные числа списком,
//    a также нечетные числа списком.

    public void ArrayOut (int[] array) {
       String EvenNum = new String();
        String OddNum = new String();
        for (int j : array) {
            if (j % 2 == 0) {
                EvenNum = EvenNum + (j) + "," + " ";
            } else {
                OddNum = OddNum + (j) + "," + " ";
            }
        }
        System.out.println("Четные числа " + EvenNum);
        System.out.println("Нечетные числа " + OddNum);

    }

    public static void main(String[] args) {
    int[] array = new int[10];
    Random random = new Random();
    for (int i = 0; i < array.length; i++){
        array[i] = random.nextInt(50);
    }
    System.out.println(Arrays.toString(array));
    new HW7part1().ArrayOut(array);
}

    }
