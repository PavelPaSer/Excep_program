package homework_1;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ваш возраст: ");
            String input = scanner.nextLine();

            int age = Integer.parseInt(input);
            System.out.println("Ваш возраст: " + age);

        } catch (NumberFormatException ex) {
            System.out.println("Ошибка: Некорректный ввод");
        }
    }
}
