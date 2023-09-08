package Conditionals;
import java.util.Scanner;
public class Conditionals {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num1 = scan.nextInt();
//        System.out.println("Enter a second number: ");
//        int num2 = scan.nextInt();
//
//        if(num1 > num2) {
//            System.out.println(num1 + " is bigger");
//        }
//            else {
//                System.out.println(num2 + " is bigger");
//            }
//
//        System.out.println("Enter another number: ");
//        int num3 = scan.nextInt();
//            if (num3 % 2 == 0) {
//                System.out.println( num3 + " is even");
//            } else{
//                System.out.println(num3 + " is odd");
//            }
//
//        System.out.println("Enter green, orange or red: ");
//            String color = scan.next();
//
//            if (color.equals("green")) {
//                System.out.println("GO");
//            }
//            if (color.equals("orange")) {
//            System.out.println("GET SET");
//            }
//            if (color.equals("red")) {
//            System.out.println("Stop");
//            }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int seasonPicker = scan.nextInt();


        switch (seasonPicker) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("SPRING");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;
            case 9:
            case 10:
                System.out.println("AUTUMN");
                break;
            case 11:
            case 12:
                System.out.println("WINTER");
                break;
            default:
                System.out.println("Invalid day: " + seasonPicker);
        }

    }
}
