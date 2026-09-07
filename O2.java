import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        // by Hannah Rohringer
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            int score;

            // Read the score until it is valid
            do {
                System.out.print("Enter score for student " + i + ": ");
                score = input.nextInt();

                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a score between 0 and 100.");
                }

            } while (score < 0 || score > 100);

            // Find the grade
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 60) {
                System.out.println("Grade: C");
            } else if (score >= 50) {
                System.out.println("Grade: D");
            } else if (score >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}
