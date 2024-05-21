/*Напишите программу с методом для отображения текстовой строки в обратном порядке*/

public class Main {
    static String reverseString(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[str.length() - 1 - i];
            chars[str.length() - 1 - i] = temp;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "Сегодня плохая погода";
        System.out.println(str);
        System.out.println(reverseString(str));
    }
}