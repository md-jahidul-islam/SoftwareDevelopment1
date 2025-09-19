import java.util.Scanner;

public class TooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            int length = str.length();

            if (length > 10) {

                System.out.println("" + str.charAt(0) + (length - 2) + str.charAt(length - 1));
            } else {
                System.out.println(str);
            }
        }

        sc.close();
    }
}