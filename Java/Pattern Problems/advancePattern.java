import java.util.Scanner;

public class advancePattern {
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Upper half
        for (int i = 1; i <= num; i++) {
            // Part:1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (num - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Part: 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Lower half
        for (int i = num; i >= 1; i--) {
            // Part:1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (num - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Part: 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}