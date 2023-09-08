package Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = scan.nextInt();
        System.out.println("Enter a second number: ");
        double num2 = scan.nextInt();

        System.out.println("Enter an operator: + - * / : ");
            String operator = scan.next();


            if (operator.equals("+")) {
            System.out.println(num1 + num2);
        }
            else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        }
            else if (operator.equals("/")) {
                System.out.println(num1 / num2);
            }
            else if (operator.equals("*")) {
                System.out.println(num1 * num2);
            }
            else {
                System.out.println("invalid operator");
            }
    }
}
