import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        double result;
        char operation;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        number1 = reader.nextDouble();
        number2 = reader.nextDouble();
        System.out.print("\nВведите математическое действие (+, -, *, /): ");
        operation = reader.next().charAt(0);
        switch(operation) {
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1 / number2;
                break;
            default:  System.out.printf("Неверная операция, попробуйте еще раз");
                return;
        }
        System.out.print("\n Ответ: \n");
        System.out.printf(number1 + " " + operation + " " + number2 + " = " + result);
    }
}