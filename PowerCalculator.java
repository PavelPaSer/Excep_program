/*
Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию
возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление на ноль,
необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        double degreeBasis;
        double degreeIndicator;
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) { 
                try {
                    System.out.print("Введите основание степени: ");
                    degreeBasis = scanner.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: введенные данные не являются числом.\n");
                    scanner.nextLine();
                }
            }

            while (true) { // Ввод показателя степени.
                try {
                    System.out.print("Введите показатель степени: ");
                    degreeIndicator = scanner.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: введенные данные не являются числом.\n");
                    scanner.nextLine();
                }
            }

            try {
                double result = calculatePower(degreeBasis, degreeIndicator);
                System.out.printf("Решение: %.2f ** %.2f = %.2f", degreeBasis, degreeIndicator, result);
            } catch (InvalidInputException e) {
                System.out.println("Ошибка: " + e.getMessage() + "\n");
            }
        } catch (Exception ex) {
            System.out.println("Ошибка.\n");
        } finally {
            scanner.close(); 
        }
    }

    public static double calculatePower(double a, double b) throws InvalidInputException {
        if (a == 0) {
            throw new InvalidInputException("Введено некорректное основание (ноль).");
        }
        if (b < 0) {
            throw new InvalidInputException("Введен некорректный показатель (отрицательная степень).");
        }
        return Math.pow(a, b);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
