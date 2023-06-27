package homework_1;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Деление на ноль недопустимо");
            }

            double result = (double) num1 / num2;
            System.out.println("Результат деления: " + result);

        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: " + ex.getMessage());

        } catch (Exception ex) {
            System.out.println("Ошибка! Введите только целые числа.");
        }
    }
}
