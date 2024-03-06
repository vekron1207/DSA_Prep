import java.util.Scanner;

public class greaterOfTwo {

    public static int greaterInTwo(int a, int b) {
        if (a > b) {
            System.out.println("A is greater");
            return a;
        } else {
            System.err.println("B is greater");
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N1: ");
        int a = sc.nextInt();

        System.out.print("Enter N2: ");
        int b = sc.nextInt();

        System.err.println("Greater numbre is: " + greaterInTwo(a, b));
        sc.close();

    }
}
