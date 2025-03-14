
import java.util.*;
public class Ques_29 {
  public static void main(String[] args) {
  // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
    Scanner sc = new Scanner(System.in);
    int n;
    int sumNegative = 0;
    int sumPositiveEven = 0;
    int sumPositiveOdd = 0;

    System.out.println("Enter the number of elements: ");
    n = sc.nextInt();

    while (n!=0) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      if (num < 0) {
        sumNegative += num;
      } else if (num % 2 == 0) {
        sumPositiveEven += num;
      } else {
        sumPositiveOdd += num;
      }
      n--;
    }
    System.out.println("Sum of negative numbers: " + sumNegative);
    System.out.println("Sum of positive even numbers: " + sumPositiveEven);
    System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    sc.close();

  }
}