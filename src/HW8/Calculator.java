package HW8;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    public void summ(double a, double b) {
        System.out.println("Сумма = " + (a+b));
    }

    public void minus(double a, double b) {
        System.out.println("Разница = " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println("Умножение = " + (a * b));
    }

    public void division(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на 0 невозможно");
        } else {
            System.out.println("Деление = " + (a / b));
        }
    }
    public void start() {
        System.out.println("Калькулятор запущен");
        while (true){
            System.out.println("Введите действие:");
            String action = scanner.nextLine();
                if (action.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт.");
                    break;
                } else if (action.contains("+")) {
                    double a = Double.parseDouble(action.split("[+]")[0]);
                    double b = Double.parseDouble(action.split("[+]")[1]);
                    summ(a, b);
                        } else if (action.contains("-")) {
                    double a = Double.parseDouble(action.split("[-]")[0]);
                    double b = Double.parseDouble(action.split("[-]")[1]);
                    minus(a, b);
                } else if (action.contains("/")) {
                    double a = Double.parseDouble(action.split("[/]")[0]);
                    double b = Double.parseDouble(action.split("[/]")[1]);
                    division(a, b);
                } else if (action.contains("*")) {
                    double a = Double.parseDouble(action.split("[*]")[0]);
                    double b = Double.parseDouble(action.split("[*]")[1]);
                    multiply(a, b);

                } else {
                    System.out.println("Введите корректное действие");
                }
        }

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
                }










