package Ex2;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Мінімальне з N чисел (використовувати LinkedList):
 * 1. Введіть із клавіатури число N.
 * 2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
 * 3. Знайти мінімальне число серед елементів списку – метод getMinimum.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scannerInputNumber = new Scanner(System.in);
        try {
            System.out.print("Введите колличество чисел : ");
            int numberList = scannerInputNumber.nextInt();
            LinkedList<Integer> someList = MinNumberLinkedList.getIntegerList(numberList);
            System.out.println("Значения :" + someList);
            System.out.println("Минимальное число : " + MinNumberLinkedList.getMinimum(someList));

        } catch (InputMismatchException exception) {
            System.out.println("Вы ввели неправильное значение ");
        }


    }


}