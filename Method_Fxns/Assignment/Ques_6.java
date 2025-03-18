
import java.util.Scanner;

public class Ques_6 {

    public static boolean isnum(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (isnum(n)) {
            System.out.println(n + "is Prime");
        } else {
            System.out.println(n + "is not Prime");
        }

    }
}
