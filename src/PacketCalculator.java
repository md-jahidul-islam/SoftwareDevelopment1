import java.util.Scanner;

public class PacketCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total items required (N): ");
        int totalRequired = sc.nextInt();

        System.out.print("Enter items already available (X): ");
        int itemsAvailable = sc.nextInt();

        int remainingNeeded = totalRequired - itemsAvailable;
        int packetsNeeded = (int) Math.ceil((double) remainingNeeded / 4);

        System.out.println("Total items needed: " + totalRequired);
        System.out.println("Items already available: " + itemsAvailable);
        System.out.println("Remaining items needed: " + remainingNeeded);
        System.out.println("Minimum packets needed (4 items per packet): " + packetsNeeded);

        sc.close();
    }
}