import java.util.Scanner;

public class circumference {
    public static float circumfe(float r) {
        float circ = (float) (2 * 3.14 * r);
        return circ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r = sc.nextFloat();

        System.out.print("Circumference of the circle is: " + circumfe(r));
        sc.close();
    }
}
