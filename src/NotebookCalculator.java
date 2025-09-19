import java.util.Scanner;

public class NotebookCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of problems: ");
        int problems = sc.nextInt();

        int totalPages = problems * 1000;

        int totalNotebooks = totalPages / 100;

        System.out.println("Total problems: " + problems);
        System.out.println("Total pages needed: " + totalPages);
        System.out.println("Total notebooks required: " + totalNotebooks);

        sc.close();
    }
}