
import java.util.Scanner;

public class Ques_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        sc.close();
        calcProduct(num1, num2);
    }

    public static void calcProduct(int x, int y) {
        int result = 0;
        result = x * y;
        System.out.println("product of two numbers  " + result);
    }
}
