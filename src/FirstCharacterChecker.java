import java.util.Scanner;

public class FirstCharacterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Error: Empty string entered");
            return;
        }

        char firstChar = str.charAt(0);

        if (firstChar == 'A' || firstChar == 'B' || firstChar == 'C') {
            System.out.println("Yes, first character is A, B, or C");
        } else {
            System.out.println("No, first character is not A, B, or C");
        }

        sc.close();
    }
}