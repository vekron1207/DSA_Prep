// To print the table of a given number.

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println(result);
        }
        sc.close();
    }
}
