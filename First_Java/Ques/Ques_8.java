import java.util.Scanner;

public class Ques_8 {
  public static void main(String[] args) {
    //To find Armstrong Number between two given number.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter second number: ");
    int num2 = scanner.nextInt();
    scanner.close();
    
    System.out.println("Armstrong numbers between " + num1 + " and " + num2 + " are:");
    for (int i = num1; i <= num2; i++) {
      int num = i;
      int sum = 0;
      int count = 0;
      int temp = num;
      while (temp != 0) {
        temp = temp / 10;
        count++;
      }
      temp = num;
      while (temp != 0) {
        int rem = temp % 10;
        sum = sum + (int) Math.pow(rem, count);
        temp = temp / 10;
      }
      if (sum == num) {
        System.out.println(num);
      }
    }

  }
}
