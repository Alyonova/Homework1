package HW3;

import java.util.Scanner;

public class HW3part6 {
    public static void main(String[] args) {
//        Используя оператор switch написать программу, которая выводит на
//        консоль ссылку для скачивания программы. Из выбора программ взять:
//        IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
//        Программа должна спросить пользователя какая программа ему интересна,
//       также спросить какую ОС он использует, а после вывести в консоль необходимую
//      ссылку. Если программа с таким названием не существует выводит сообщение в
//      консоль, о том что такой программы не существует. Если указанной пользователем
//      ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая программа Ваc интересует: IntelliJ IDEA, Git, Java?");
        String program = scanner.nextLine();
        System.out.println("Какую ОС вы используете: Linux, macOS, Windows?");
        String selectedOC = scanner.nextLine();
        switch (program) {
            case ("IntelliJ IDEA"):
                switch (selectedOC) {
                    case ("Linux"):
                        System.out.println("Ссылка для скачивания" + " " + "https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    case ("macOS"):
                        System.out.println("Ссылка для скачивания:" + " " + "https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case ("Windows"):
                        System.out.println("Ссылка для скачивания" + " " + "https://www.jetbrains.com/idea/download/?section=windows");
                }
                break;
            case ("Git"):
                    switch (selectedOC) {
                        case ("Linux"):
                            System.out.println("Ссылка для скачивания:" + " " +"https://git-scm.com/download/linux");
                            break;
                        case ("macOS"):
                            System.out.println("Ссылка для скачивания:" + " " + "https://git-scm.com/download/mac");
                            break;
                        case ("Windows"):
                            System.out.println("Ссылка для скачивания:" + " " + "https://git-scm.com/download/win");
                    }
                            break;

            case ("Java"):
                switch (selectedOC) {
                    case ("Linux"):
                        System.out.println("Ссылка для скачивания:" + " " + "https://www.java.com/en/download/");
                        break;
                    case ("macOS"):
                        System.out.println("Ссылка для скачивания:" + " " +"https://www.java.com/en/download/");
                        break;
                    case ("Windows"):
                        System.out.println("Ссылка для скачивания:" + " " + "https://www.java.com/en/download/");
                }
                    break;
                default:
                    System.out.println("Такой программы не существует");
        }
    }}

