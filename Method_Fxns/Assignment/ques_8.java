import java.util.*;

public class ques_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close(); // Close Scanner to avoid resource leak
        
        System.out.println("The factorial of the given number is: " + Factorial(n));
    }

    public static long Factorial(int n) {
        long fact = 1;  // Use long to handle larger values
        for (int i = 1; i <= n; i++) {  // Start loop from 1
            fact *= i;
        }
        return fact;
    }
}