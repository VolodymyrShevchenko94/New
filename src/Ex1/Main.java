package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Використовуючи колекцію, підвійте слово:

 1. Введіть із клавіатури 5 слів до списку рядків.

 2. Метод doubleValues ​​повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.

 3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        while (l.size() < 5) {
            System.out.println("Введите значение " + (l.size()+ 1) +  "/5:");
            String value = sc.nextLine();
            l.add(value);
        }

        List<String> newList = doubleValues(l);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }

    public static List<String> doubleValues(List<String> list){
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            temp.add(list.get(i));
            temp.add(list.get(i));
        }
        return temp;
    }
}
