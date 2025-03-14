import java.util.Scanner;


public class Ques_6 {
  public static void main(String[] args) {
    //Input currency in rupees and output in USD.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount in INR: ");
    double inr = scanner.nextDouble();
    double usd = inr / 74.85;
    System.out.println("Amount in USD: " + usd);
    scanner.close();
    //type 2
    //Input currency in USD and output in INR.
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter the amount in USD: ");
    // double usd = scanner.nextDouble();
    // double inr = usd * 74.85;
    // System.out.println("Amount in INR: " + inr);
    // scanner.close();
  }
}
