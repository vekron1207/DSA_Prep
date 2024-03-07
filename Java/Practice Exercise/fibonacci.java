import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        // Since first two digits of fibonacci are static we need an array of n+2
        int n = sc.nextInt();
        int[] series = new int[n + 2];

        // first two elements of the series
        series[0] = 0;
        series[1] = 1;

        // Now to generate fibonacci series.
        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        // now to print fibonacci series
        for (int i = 0; i <= n; i++) {
            System.out.print(series[i] + " ");
        }

        sc.close();
    }
}
