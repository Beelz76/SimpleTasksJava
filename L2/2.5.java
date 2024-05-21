/*Напишите программу, в которой на заданном интервале времени случайно выбирается дата и время, и для этой даты отображается день недели*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar firstDate = Calendar.getInstance();
        Calendar secondDate = Calendar.getInstance();
        firstDate.set(2023, Calendar.MARCH, 1);
        secondDate.set(2023, Calendar.AUGUST, 31);

        long firstTime = firstDate.getTimeInMillis();
        long secondTime = secondDate.getTimeInMillis();

        Random random = new Random();
        long randomTime = random.nextLong(secondTime - firstTime) + firstTime;

        Date randomDate = new Date(randomTime);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
        System.out.println("Случайные дата и время: " + sdf.format(randomDate));

        sdf = new SimpleDateFormat("EEEE");
        System.out.println("День недели: " + sdf.format(randomDate));
    }