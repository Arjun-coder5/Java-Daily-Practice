import java.util.*;

public class Ques_20{
  
 
  public static void main(String[] args) {
    //Find if a number is pelindrome or not: 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int rev = 0,  temp = num;
    
    while (temp!= 0) {
      temp = temp%10;
      rev = rev * 10+ temp ;
      temp = temp / 10;
    }
    // by recursion:
    // rev = reverse(num);
    if (num == rev) {
      System.out.println(num + " is a palindrome.");
    } else {
      System.out.println(num + " is not a palindrome.");
    }
    sc.close();



  }
}
