import java.util.*;
public class Ques_27 {
  public static void main(String[] args) {
    // Sum of digit of a number : 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    int sum = 0;
    while (num!=0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("Sum of digits : " + sum);


  }
}
