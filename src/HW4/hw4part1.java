package HW4;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class hw4part1 {
//    1)
//    Написать программу, которая будет считывать введенные пользователем слова
//    с клавиатуры слова, и склеивать их в одно предложение до тех пор, пока пользователь
//    не введет с клавитуры слово STOP. Все слова введенные до этого должны отобразится
//    в консоли одним предложением.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();
        System.out.println("Введите слово:");
        String word;
        while (!(word = scanner.next()).equalsIgnoreCase("STOP")) {
            sentence.append(word).append(" ");
        }

        System.out.println(sentence.toString().trim());
    }
}




