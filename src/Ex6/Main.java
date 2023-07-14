package Ex6;

/**
 * Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожен з нового рядка.
 * * Завдання із зірочкою - якщо кількість символів не парна, доповнити символом по замовчуванню. Символ любий на Ваш смак наприклад *☺︎☕︎⚓︎⚛︎
 * Маємо рядок - asdfg
 * Вивід:
 * asd
 * fg⚓︎
 */

public class Main {
    public static void main(String[] args) {
        String text = "привет привет";
        int length = text.length();
        char defaultChar = (char) 0x234;
        if (text.length() % 2 != 0){
            text = text + defaultChar;
            length++;
        }
        String one = text.substring(0, length / 2);
        String two = text.substring(length / 2);
        System.out.println(one);
        System.out.println(two);
    }
}