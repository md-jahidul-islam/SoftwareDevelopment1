import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current study time (hours): ");
        int studyTime = sc.nextInt();

        int completionTime = studyTime + 3;

        if (completionTime < 10) {
            System.out.println("Complete all assignment on time");
        } else {
            System.out.println("Not enough time to complete all assignments");
        }

        sc.close();
    }
}