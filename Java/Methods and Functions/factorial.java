import java.util.Scanner;

public class factorial {

    public static int factorialNum(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("STRANGER DANGER!!");
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Factorial is: " + factorialNum(a));
        sc.close();
    }

}
