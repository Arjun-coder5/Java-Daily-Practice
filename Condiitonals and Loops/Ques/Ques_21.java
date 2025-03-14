import java.util.*;
public class Ques_21 {
  public static void main(String[] args) {
    // Future investment value : 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal amount : ");
    double P = sc.nextDouble();
    System.out.println("Enter the annual interest rate : ");
    double r = sc.nextDouble();
    System.out.println("Enter the number of years : ");
    int n = sc.nextInt();
    System.out.println("Enter the compounding frequency : ");
    int f = sc.nextInt();
    double A = P * Math.pow(1 + r/f, f*n);
    System.out.println("The future investment value is : " + A);

  }
}
