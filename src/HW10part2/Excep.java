package HW10part2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Excep {
    public int[] randomArray() {
        Random random = new Random();
        int[] array = new int[random.nextInt(1,30)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,30);
        }
        return array;
    }
    public int getIndex() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс :");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат ввода. Введите индекс (число) ");
                scanner.nextLine();
            }
    }}
            public double arrayDivision() throws DivisionByZeroException {
                try {
                    int[] array = randomArray();
                    System.out.println(Arrays.toString(array));
                    int index = getIndex();
                    int number = array[index];
                    if (array[0] == 0) {
                        throw new DivisionByZeroException("Деление на ноль недопустимо");
                    }

                    System.out.println("Индекс: " + index + " " + "выбранное число: " + number);

                    return (double) number / array[0];
                } catch (InputMismatchException | DivisionByZeroException e) {
                    System.out.println("Ошибка " + e.getMessage());
                    return arrayDivision();
                }
            }}