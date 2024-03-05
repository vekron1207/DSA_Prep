import java.util.Scanner;

public class functionMethods {
    public static void printMyName(String name) {
        System.out.println("Hello World: " + name);
        return;
    }

    public static void main(String[] args) {
        System.out.print("Gib your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
        sc.close();
    }

}
