package HW5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Random random = new Random();
       int secretNumber = random.nextInt(0,100);

        String name ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ваше имя");
        name = scanner.nextLine();
        System.out.println("Добро пожаловать, " + name);
        System.out.println("Let the game begin!");
        int x=0;
        while (x != secretNumber) {
            System.out.println("Введите число от 0 до 100");
            int number = scanner.nextInt();
            x = number;
            if (number < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (number > secretNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, "+ name +"!");
            }

        }

    }
}