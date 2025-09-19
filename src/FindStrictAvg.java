import java.util.Scanner;

public class FindStrictAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b) / 2.0;

        if (avg > c) {
            System.out.println("Yes, average (" + avg + ") is greater than " + c);
        } else {
            System.out.println("No, average (" + avg + ") is not greater than " + c);
        }

        sc.close();
    }
}
