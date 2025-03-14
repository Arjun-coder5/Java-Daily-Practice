import java.util.*;



public class Ques_1{
  public static void main(String[] args) {
    // Find given number is Even or Odd number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    if(num%2==0){
      System.out.println("Given number is Even number");
    }else{
      System.out.println("Given number is Odd number");
    }
  }
}