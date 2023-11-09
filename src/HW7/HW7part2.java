package HW7;

import java.util.*;

public class HW7part2 {
//    2)
//    Написать перегруженный метод, который может:
//
//  Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
//	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//  Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
//   Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
//// Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа: "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

public void Overload(){
    System.out.println("Я пустой");
}
public void Overload(String text){
    System.out.println("У Меня есть текст: " + text);
}
public void  Overload(String[] strings){
    System.out.println(Arrays.toString(strings) + " ");

}

public void Overload(int[] arrayNum){
    int sum = 0;
    Random random = new Random();
    for (int number : arrayNum){
        sum = sum + number;
    }
    System.out.println(sum);
    }
public void Overload (int a, String text){
    String result = "Ваше сообщение - %1$s, ваше число -  %2$d";
    System.out.printf(result, text, a);
    System.out.println();
}

    public static void main(String[] args) {
        HW7part2 task2 = new  HW7part2();
        task2.Overload();
        task2.Overload("Я - вывожу строку");
        task2.Overload(new String[]{"понедельник", "вторник", "среда"});
        task2.Overload(23, "Привет");
        task2.Overload(new int[]{1, 2, 3});
    }

}
