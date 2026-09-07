import java.util.Scanner;
 // by Hannah Rohringer
public class O3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer n > 0: ");
        int n = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(n + "! = " + factorial);
    }
}

