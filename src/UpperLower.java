import java.util.Scanner;

public class UpperLower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        input.close();
    }
}