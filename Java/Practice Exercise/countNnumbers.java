import java.util.Scanner;

public class countNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String inputLine = sc.nextLine();

        // Need to learn, looked it up online
        String[] tokens = inputLine.split("\\s+");

        int countNegative = 0;
        int countZero = 0;
        int countPositive = 0;

        for (String token : tokens) {
            int num = Integer.parseInt(token);

            if (num == 0) {
                countZero++;
            } else if (num < 0) {
                countNegative++;
                countPositive++;
            }
        }

        System.out.println("Number of positive numbers: " + countPositive);
        System.out.println("Number of negative numbers: " + countNegative);
        System.out.println("Number of zeros: " + countZero);

        sc.close();
    }
}
