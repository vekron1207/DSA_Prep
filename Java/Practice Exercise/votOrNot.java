import java.util.Scanner;

public class votOrNot {
    public static String voteNot(int a) {
        if (a < 18) {
            return ("Can't Vote, GO HOME!!");
        } else if (a > 100) {
            return ("You cant be that old!! C'mon!");
        } else {
            return ("Vote wisely :)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you: ");
        int a = sc.nextInt();

        System.out.print(voteNot(a));
        sc.close();
    }
}
