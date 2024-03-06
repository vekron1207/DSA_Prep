import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. 1: ");
        int a = sc.nextInt();

        System.out.print("Enter no. 2: ");
        int b = sc.nextInt();

        System.out.print("Choose function: +, -, *, /: ");
        String result = sc.next();

        switch (result) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println((double) a / b);
                break;
            default:
                break;
        }
        sc.close();
    }
}
