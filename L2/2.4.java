/*Напишите программу, в которой определяется время и дата через 1 000 000 секунд после текущей даты и времени*/

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();;
        System.out.println("Сейчас: " + currentDate);
        System.out.println("Через миллион секунд: " + new Date(currentDate.getTime() + 1000000000));
    }
}