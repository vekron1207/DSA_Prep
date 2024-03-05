import java.util.Scanner;

public class twoNumSumFunc {
    public static int calSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int mulTwo(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();

        System.out.print("B: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Sum: " + calSum(a, b));
        System.out.println("Multiply: " + mulTwo(a, b));
    }

}
