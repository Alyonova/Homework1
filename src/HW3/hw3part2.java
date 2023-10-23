package HW3;

//2)
//  Пользователь вводит с клавиатуры три целочисленных значения.
//  На экран выводится информация можно ли из этих сторон построить треугольник.
//  (необходимо вспомнить правило построения треугольника по трем сторонам).
//a+b>c

import java.util.Scanner;

public class hw3part2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = numbers.nextInt();
        System.out.println("Введите число b:");
        int b = numbers.nextInt();
        System.out.println("Введите число c:");
        int c = numbers.nextInt();

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a))
        {
            System.out.println("Можно построить треугольник");
        } else {
                System.out.println("Нельзя построить треугольник.");
            }


            }}




