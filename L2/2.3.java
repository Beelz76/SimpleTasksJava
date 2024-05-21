/*Напишите программу с методом, которым текст отображается в консоли, причем каждое слово из текста отображается в отдельной строке*/

public class Main {
    static void printWordsFromString(String str) {
        String[] words = str.split(" ");
        for (String word: words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String str = "Каждое слово с новой строки";
        printWordsFromString(str);
    }
}