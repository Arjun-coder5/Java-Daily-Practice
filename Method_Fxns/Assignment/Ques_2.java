
import java.util.Scanner;

public class Ques_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");

        }
    }
}
