package HW3;

import javax.print.attribute.standard.PresentationDirection;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class HW3part5 {
//    Написать программу, используя тернарный оператор, где пользователь вводит с
//    клавиатуры два числа и символ – или + или % или / или *. На экран выводится
//    резултат действия над двумя введенными числами. Если пользователь ввел что-то
//    кроме данных символов, то необходимо вывести 0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /, %): ");
        char symbol = scanner.next().charAt(0);

        int result =
                symbol == '+' ? num1 + num2 :
                symbol == '-' ? num1 - num2 :
                symbol == '*' ? num1 * num2 :
                symbol == '/' ? (num2 != 0 ? num1 / num2 : 0) :
                symbol == '%' ? (num2 != 0 ? num1 % num2 : 0) : 0;

        System.out.println(result);
    }
}



