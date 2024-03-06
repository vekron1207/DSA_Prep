import java.util.Scanner;

public class Sum_n_numbers {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int Sum = 0;
        for (int i = 0; i <= n; i++) {
            Sum += i;
        }
        System.out.println("Sum: " + Sum);
        userInput.close();
    }
}
