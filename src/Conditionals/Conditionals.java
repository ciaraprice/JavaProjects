package Conditionals;
import java.util.Scanner;
public class Conditionals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = scan.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " is bigger");
        }
            else {
                System.out.println(num2 + " is bigger");
            }

        System.out.println("Enter another number: ");
        int num3 = scan.nextInt();
            if (num3 % 2 == 0) {
                System.out.println( num3 + " is even");
            } else{
                System.out.println(num3 + " is odd");
            }

        System.out.println("Enter green, orange or red: ");
            String color = scan.next();

            if (color.equals("green")) {
                System.out.println("GO");
            }
            if (color.equals("orange")) {
            System.out.println("GET SET");
            }
            if (color.equals("red")) {
            System.out.println("Stop");
            }
    }
}
