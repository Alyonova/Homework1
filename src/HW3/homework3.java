package HW3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите что-то:");

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        String string4 = " ";
        while (scanner.hasNext()) {
            string4 = scanner.next() + " ";
            System.out.println(string4);
        }


    }}

