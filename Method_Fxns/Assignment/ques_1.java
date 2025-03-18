
import java.util.Scanner;

public class ques_1 {

    static int Maximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int Minimum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int n_1 = sc.nextInt();
        System.out.println("Enter the Second elements");
        int n_2 = sc.nextInt();
        System.out.println("Enter the Third elements");
        int n_3 = sc.nextInt();
        int maximum = Maximum(n_1, n_2, n_3);
        int minimum = Minimum(n_1, n_2, n_3);
        System.out.println("Maximum number is: " + maximum);
        System.out.println("Minimum number is: " + minimum);
    }
}
