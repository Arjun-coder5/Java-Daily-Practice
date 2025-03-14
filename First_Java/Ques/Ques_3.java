import java.util.Scanner;

public class Ques_3 {
  public static void main(String[] args) {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    
    // Formulae:
    // Simple Interest = (P * T * R) / 100
    // Compound Interest = P * (1 + R/100)^T - P
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principal amount: ");
    double p  = sc.nextDouble();
    System.out.println("Enter Time period: ");
    double t = sc.nextDouble();
    System.out.println("Enter Rate of Interest: ");

    double r = sc.nextDouble();
    double simpleInterest = (p * t * r) / 100;
    double compoundInterest = p * Math.pow(1 + r/100, t) - p;
    System.out.println("Simple Interest: " + simpleInterest);
    System.out.println("Compound Interest: " + compoundInterest);
    sc.close();
  }
}
