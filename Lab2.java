import java.util.Scanner;
public class Lab2 {
    public static void factorialDueToWhile(int n) {
        if (n >= 15 || n < 0) System.out.println("n should be < 15 and >= 0");
        else {
            int fact = 1;
            while (n > 1) {
                fact *= n;
                n -= 1;
            }
            System.out.println("The final factorial is " + fact);
        }
    }
    public static void factorialDueToFor(int n) {
        if (n >= 15 || n < 0) System.out.println("n should be < 15 and >= 0");
        else {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            System.out.println("The final factorial is " + fact);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("For or While? Enter 1 if 'while' or 2 if 'for'");
            int OneOrTwo = sc.nextInt();
            if (OneOrTwo == 1) {
                System.out.println("Enter n");
                int n = sc.nextInt();
                factorialDueToWhile(n);
            }
            if (OneOrTwo == 2) {
                System.out.println("Enter n");
                int n = sc.nextInt();
                factorialDueToFor(n);
            }
            if (OneOrTwo != 1 && OneOrTwo != 2) System.out.println("Error");
            sc.close();
        }
        catch (Exception e) {
           System.out.println("Error");
        }
    }
}
