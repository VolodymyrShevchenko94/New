package Ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Спроектуйте та розробіть метод, який визначає, скільки часу пройшло із заданої дати.
 * За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді, наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».
 */

public class Main {
        public static void main(String args[]) {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            Calendar calendar = Calendar.getInstance();
            int tMon = calendar.get(Calendar.MONTH);
            int tDay = calendar.get(Calendar.DATE);
            int tYr = calendar.get(Calendar.YEAR);
            int myMon, myDay, myYr,days;

            System.out.println("Сегодня: " + tDay + " " + tMon + " " + tYr);

            try {
                System.out.println("Введите дату вашего рождения");
                System.out.println("Введите день: ");
                String day = br.readLine();
                myDay = Integer.parseInt(day);
                System.out.println("Введите месяц: ");
                String mon = br.readLine();
                myMon = Integer.parseInt(mon);
                System.out.println("Введите год: ");
                String yr = br.readLine();
                myYr = Integer.parseInt(yr);

                Calendar myBirthday = Calendar.getInstance();
                myBirthday.set(myYr, myMon, myDay);
                if(myDay>tDay){
                    days=myDay-tDay;
                }else{
                    days=tDay-myDay;
                }

                System.out.println("С дня моего рождения прошло: " + (tYr - myYr)
                        + " лет " + (tMon - myMon) + " месяцев " + days
                        + " дней");

            } catch (IOException e) {
            }
        }
    }


