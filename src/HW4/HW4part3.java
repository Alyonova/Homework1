package HW4;

import java.util.Scanner;

public class HW4part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите максимальный вес, который может храниться на складе: ");
        int maxWeight = scanner.nextInt();
        int availableWeight = maxWeight;

        while (availableWeight > 0) {
            System.out.print("Введите вес металла, который вы хотите сдать на склад: ");
            int weight = scanner.nextInt();

            if (weight < 5) {
                System.out.println("Нельзя принимать металл весом менее 5.");
            } else if (weight > availableWeight) {
                System.out.println("На складе недостаточно места для приема данного веса металла.");
        } else {
                availableWeight = availableWeight - weight;
                System.out.println("Принято " + weight + " единиц металла.");
                System.out.println("Вы можете сдать еще: " + availableWeight);
            }
        }

        System.out.println("Место на складе закончилось.");
    }
}
