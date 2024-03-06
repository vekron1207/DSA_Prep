import java.util.Scanner;

public class sumOddNum {

    public static int sumOddNums(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.err.print("Sum of all odd number till " + n + " is: " + sumOddNums(n));

        sc.close();
    }

}
