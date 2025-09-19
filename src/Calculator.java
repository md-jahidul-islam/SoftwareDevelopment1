import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Answer is: " + (a + b));
                break;
            case '-':
                System.out.println("Answer is: " + (a - b));
                break;
            case '*':
                System.out.println("Answer is: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Answer is: " + ((double) a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}