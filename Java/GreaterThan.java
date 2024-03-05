import java.util.Scanner;

public class GreaterThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();

        System.err.print("B: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is greater");
        } else {
            System.out.println("A is less");
        }
    }
}
