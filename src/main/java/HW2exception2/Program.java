package HW2exception2;
import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextInt();

        try {
            if (num2 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }

            double result = num1 / num2;
            System.out.println("Результат деления: " + result);

        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
