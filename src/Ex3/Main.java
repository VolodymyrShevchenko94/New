package Ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Програма визначає, яка сім'я (прізвище) живе у місті:
 *
 * Приклад введення:
 *
 * · Москва
 *
 * · Іванови
 *
 * · Київ
 *
 * · Петрови
 *
 * · Лондон
 *
 * · Абрамовичі
 *
 * Приклад введення:
 *
 * · Лондон
 *
 * Приклад виведення:
 *
 * · Абрамовичі
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> families = new HashMap<>();
        families.put("Москва", "Ивановы");
        families.put("Киев", "Петровы");
        families.put("Лондон", "Абрамовичи");
        System.out.println("Выберите город :Москва,Киев,Лондон");
        String town = sc.nextLine();
        if (families.containsKey(town)){
            System.out.println(families.get(town));
        }else {
            System.out.println("отсуцтвует город");
        }

    }
}
