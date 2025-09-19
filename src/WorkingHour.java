import java.util.Scanner;

public class WorkingHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter daily working hours (Saturday to Tuesday): ");
        int dailyHours = sc.nextInt();

        System.out.print("Enter Wednesday working hours: ");
        int wednesdayHours = sc.nextInt();

        int totalHours = (dailyHours * 4) + wednesdayHours;

        System.out.println("The total number of working hours in one week: " + totalHours);

        sc.close();
    }
}