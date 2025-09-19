import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        System.out.print("Enter minimum age to vote: ");
        int minAge = sc.nextInt();

        int[] ages = new int[n];
        int eligible = 0;

        System.out.println("Enter ages of " + n + " people:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] >= minAge) {
                eligible++;
            }
        }

        System.out.println("Number of eligible voters: " + eligible);

        sc.close();
    }
}