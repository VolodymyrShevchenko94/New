package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 * 1. Створити перелік рядків.
 * 2. Ввести рядки з клавіатури та додати їх до списку.
 * 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 * 4. Вивести рядки на екран, кожен з нового рядка.
 */


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("введите слова: ");
        System.out.println("end заканчивает программу");

        while (true) {
            String someWord = scanner.next();
            if (someWord.equals("end")) {
                break;
            } else {
                stringBuilder.append(someWord).append("\n");
            }
        }

        System.out.println(stringBuilder.toString());

    }


}
