import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes: ");
        int classes = sc.nextInt();

        System.out.print("Enter students per class: ");
        int studentsPerClass = sc.nextInt();

        System.out.print("Enter number of passed students: ");
        int passedStudents = sc.nextInt();

        int totalStudents = classes * studentsPerClass;

        if (passedStudents > totalStudents / 2) {
            System.out.println("YES, More than 50% passed");
        } else {
            System.out.println("No, not more than 50% passed");
        }

        sc.close();
    }
}