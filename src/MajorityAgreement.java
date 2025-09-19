import java.util.Scanner;

public class MajorityAgreement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter votes for Party A: ");
        int partyA = sc.nextInt();

        System.out.print("Enter votes for Party B: ");
        int partyB = sc.nextInt();

        System.out.print("Enter votes for Party C: ");
        int partyC = sc.nextInt();

        if ((partyA > partyB && partyA > partyC) ||
                (partyB > partyA && partyB > partyC) ||
                (partyC > partyA && partyC > partyB)) {
            System.out.println("Yes, Agree - Majority exists");
        } else {
            System.out.println("No agreement - It's a tie");
        }

        sc.close();
    }
}