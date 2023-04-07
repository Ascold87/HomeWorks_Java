// Java: знакомство и как пользоваться базовым API (семинары)
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// 3. В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.LinkedList; // импорт коллекции LinkedList
import java.util.Scanner;   // импорт сканнера

public class hw4_3 {
    public static void main(String[] args) {
        String command = "";
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.printf("Enter the first number: ");
        int result = 0;
        int number1 = input.nextInt();
        while (!command.equals("stp")) {
            stack.push(number1);
            System.out.printf("Enter an operator: ");
            String sign = input.next();
            System.out.printf("Enter the second number: ");
            int number2 = input.nextInt();
            switch (sign) {
                case ("+"):
                    result = number1 + number2;
                    break;
                case ("-"):
                    result = number1 - number2;
                    break;
                case ("*"):
                    result = number1 * number2;
                    break;
                case ("/"):
                    result = number1 / number2;
                    break;
            }

            System.out.println(number1 + sign + number2 + "=" + result);
            number1 = result;

            System.out.println("Enter the 'rmv' command to return to the previous result");
            System.out.println("Enter the 'stp' command to shut down");
            System.out.println("Enter any symbol to continue working");
            command = input.next();

            switch (command) {
                case ("stp"):
                    break;
                case ("rmv"):
                    number1 = stack.pop();
                    System.out.println("Backspace");
                    System.out.println("First number: " + number1);
                    break;
                default:
                    System.out.println("First number: " + number1);
                    break;
            }
        }
        input.close();
    }
}
