import java.util.Scanner;

public class DebugThis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input your score : ");
        int testscore = input.nextInt();

        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
    }
}
