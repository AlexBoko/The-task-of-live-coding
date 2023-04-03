import java.util.Scanner;
/**
Задача на лайв-кодинг
        Напишите пример обработки нескольких исключений в одном блоке catch.
**/

public class Main {

    public static void main(String[] args) {
        try {
            // Код, который может выбросить исключения
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = 10 / a;
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
