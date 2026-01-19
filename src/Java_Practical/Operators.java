package Java_Practical;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("\nChoose Operator Type:");
        System.out.println("1. Arithmetic");
        System.out.println("2. Unary");
        System.out.println("3. Relational");
        System.out.println("4. Logical");
        System.out.println("5. Bitwise");
        System.out.println("6. Shift");
        System.out.println("7. Assignment");
        System.out.println("8. Ternary");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));
                break;

            case 2:
                int x = a;
                System.out.println("x++ = " + (x++));
                System.out.println("++x = " + (++x));
                System.out.println("x-- = " + (x--));
                System.out.println("--x = " + (--x));
                break;

            case 3:
                System.out.println("a == b : " + (a == b));
                System.out.println("a != b : " + (a != b));
                System.out.println("a > b : " + (a > b));
                System.out.println("a < b : " + (a < b));
                break;

            case 4:
                System.out.println("(a>0 && b>0) = " + (a > 0 && b > 0));
                System.out.println("(a>0 || b>0) = " + (a > 0 || b > 0));
                break;

            case 5:
                System.out.println("a & b = " + (a & b));
                System.out.println("a | b = " + (a | b));
                System.out.println("a ^ b = " + (a ^ b));
                System.out.println("~a = " + (~a));
                break;

            case 6:
                System.out.println("a << 1 = " + (a << 1));
                System.out.println("a >> 1 = " + (a >> 1));
                break;

            case 7:
                int y = a;
                y += b;
                System.out.println("y += b = " + y);
                break;

            case 8:
                int max = (a > b) ? a : b;
                System.out.println("Max = " + max);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
