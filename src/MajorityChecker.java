import java.util.Scanner;

public class MajorityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter votes for Company A: ");
        int companyA = sc.nextInt();

        System.out.print("Enter votes for Company B: ");
        int companyB = sc.nextInt();

        System.out.print("Enter votes for Company C: ");
        int companyC = sc.nextInt();

        System.out.print("Enter votes for Company D: ");
        int companyD = sc.nextInt();

        int totalVotes = companyA + companyB + companyC + companyD;

        if (companyA > totalVotes / 2 ||
                companyB > totalVotes / 2 ||
                companyC > totalVotes / 2 ||
                companyD > totalVotes / 2) {
            System.out.println("YES - Majority exists");
        } else {
            System.out.println("NO - No majority");
        }

        sc.close();
    }
}