import java.util.*;

public class Ques_18 {
  public static void main(String[] args) {
    //Armstrong Number  : 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    int digit;
    while (temp!=0) {
      digit = temp % 10;
      sum = sum + (int) Math.pow(digit, 3);
      temp = temp / 10;
    }
    if (sum == n) {
      System.out.println(n + " is an Armstrong number.");
    } else {
      System.out.println(n + " is not an Armstrong number.");
    }

  }
}

/*
Execution result: 
Enter the number: 
153
*/