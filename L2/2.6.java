/*Напишите программу, в которой дата выводится в формате, в котором сначала следует год,затем месяц, после этого – день месяца*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.println(currentDate);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd");

        System.out.println("Сегодня " + sdf.format(currentDate));
    }
}