import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 //by Hannah Rohringer 
        System.out.print("Enter gross income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (income > 226100) {
            tax += (Math.min(income, 318300) - 226100) * 0.017;
        }

        if (income > 318300) {
            tax += (Math.min(income, 725050) - 318300) * 0.04;
        }

        if (income > 725050) {
            tax += (Math.min(income, 980100) - 725050) * 0.137;
        }

        if (income > 980100) {
            tax += (Math.min(income, 1467200) - 980100) * 0.168;
        }

        if (income > 1467200) {
            tax += (income - 1467200) * 0.178;
        }

        System.out.println("Grading tax: " + tax + " kroner");
    }
}