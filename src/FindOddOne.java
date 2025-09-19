import java.util.Scanner;

public class FindOddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a != c) {
            System.out.println(c + " is unique");
        } else if (a == c && a != b) {
            System.out.println(b + " is unique");
        } else if (b == c && b != a) {
            System.out.println(a + " is unique");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("No unique number found");
        }

        sc.close();
    }
}