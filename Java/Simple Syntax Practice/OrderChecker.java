import java.util.List;

public class OrderChecker {
    public static boolean isInDescendingOrder(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                return false; // If any element is smaller than the next one, not in descending order
            }
        }
        return true; // If all elements are in descending order
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 4, 3, 2, 1); // Example list
        if (isInDescendingOrder(list))
            System.out.println("List is in descending order.");
        else
            System.out.println("List is not in descending order.");
    }
}
