import java.util.*;
public class Ques_23 {
  public static void main(String[] args) {
    // Lcm
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number : ");
   int a = sc.nextInt();
   System.out.println("Enter the second number : ");
   int b = sc.nextInt();
   int gcd = gcd(a, b);
   int lcm = (a * b) / gcd;
   System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
   
    


  }

    private static int gcd(int a, int b) {
       if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
