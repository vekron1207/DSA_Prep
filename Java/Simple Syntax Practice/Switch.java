import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("World");
                break;
            case 3:
                System.out.println("Sad Boi");
                break;
            default:
                System.out.println("Choose wisely, Live well");
                break;
        }
    }
}
