import java.util.Arrays;
import java.util.List;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 25, 6, 12, 17, 121, 122, 123, 26);
        int perfectSqr = 0;

        for (int num : numbers) {
            if (num >= 0) {
                int squrt = (int) Math.sqrt(num);
                if (squrt * squrt == num) {
                    perfectSqr++;
                }
            }
        }
        System.out.println("Number of Perfect Squares: " + perfectSqr);
    }
}
