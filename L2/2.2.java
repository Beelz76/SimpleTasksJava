/*Напишите программу с методом для подсчета количества вхождений символа в текстовуюстроку*/

public class Main {
    static int numberOfOccurrences(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "Третья лабораторная работа";
        char ch = 'р';
        System.out.println(str);
        System.out.println("Кол-во символов '" + ch + "' в данной строке = " + numberOfOccurrences(str, ch));
    }
}