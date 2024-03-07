import java.util.Scanner;

public class powerFunction {
    public static double powerCalculator(double x, double n) {
        double power = Math.pow(x, n);
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextInt();

        System.out.print("Enter n: ");
        double n = sc.nextInt();

        System.out.print(x + " raised to the power of " + n + " is: " + (powerCalculator(x, n)));
        sc.close();
    }
}
