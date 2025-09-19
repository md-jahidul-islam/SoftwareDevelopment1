import java.util.Scanner;

public class MakeAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int C = sc.nextInt();

        double average = (A + C) / 2.0;

        if (average == (int) average) {
            System.out.println("Average is an integer: " + (int) average);
        } else {
            System.out.println("Average is not an integer: " + average);
        }

        sc.close();
    }
}