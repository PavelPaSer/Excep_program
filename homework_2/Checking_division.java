// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением 
// "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.

package homework_2;
import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Checking_division {
    public static void main(String[] args) {
        try {
            double result = divideNumbers();
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divideNumbers() throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            return num1 / num2;
        }
    }
}
