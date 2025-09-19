import java.util.Scanner;

public class IiucTvSubscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        System.out.print("Enter cost per subscription: ");
        int cost = sc.nextInt();

        int subscription = (int) Math.ceil((double) n / 6);
        int totalCost = subscription * cost;

        System.out.println("Number of subscriptions needed: " + subscription);
        System.out.println("Total cost: " + totalCost);

        sc.close();
    }
}