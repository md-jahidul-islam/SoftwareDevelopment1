import java.util.Scanner;

public class FillWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water level in bottle 1 (0=empty, 1=full): ");
        int B1 = sc.nextInt();

        System.out.print("Enter water level in bottle 2 (0=empty, 1=full): ");
        int B2 = sc.nextInt();

        System.out.print("Enter water level in bottle 3 (0=empty, 1=full): ");
        int B3 = sc.nextInt();

        int emptyCount = 0;
        if (B1 == 0) emptyCount++;
        if (B2 == 0) emptyCount++;
        if (B3 == 0) emptyCount++;

        if (emptyCount >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }

        sc.close();
    }
}