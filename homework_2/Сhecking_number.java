// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать 
// исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".

package homework_2;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Checking_number {
    public static void main(String[] args) {
        try {
            checkPositiveNumber();
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkPositiveNumber() throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }
}
