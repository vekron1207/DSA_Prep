import java.util.Scanner;

public class greatestCommonDivisor {
    public static int calculateGCD(int a, int b) {
        // Had to look up for the logic, couldn't think of it by myself
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.print("GCD of " + a + " and " + b + " is: " + calculateGCD(a, b));
        sc.close();
    }
}
