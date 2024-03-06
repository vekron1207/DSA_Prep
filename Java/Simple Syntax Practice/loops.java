public class loops {
    public static void main(String[] args) {
        // for loops
        System.out.println("This is an example of for loop: ");
        int a = 10;
        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
        System.out.println("Example for foor loop ends.\n");

        // while loop
        System.out.println("This is an example of the while loop: ");
        int j = 0;
        while (j <= a) {
            System.out.println(j);
            j++;
        }
        System.out.println("Example of while loop ends.\n");

        // do while loop
        System.out.println("This is an example of do-while loop: ");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k <= a);
        System.out.println("End of the while loop example.");
    }
}
