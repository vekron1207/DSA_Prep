import java.util.Scanner;

public class average {

    public static int averageCalculator(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N1: ");
        int a = sc.nextInt();

        System.out.print("Enter N2: ");
        int b = sc.nextInt();

        System.out.print("Enter N3: ");
        int c = sc.nextInt();

        System.out.println("Average of given numbers are: " + averageCalculator(a, b, c));

        sc.close();
    }
}