import java.util.Scanner;

public class Ques_5 {
  public static void main(String[] args) {
    //Take 2 numbers as input and print the largest number.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double num1 = sc.nextDouble();
    System.out.println("Enter second number: ");
    double num2 = sc.nextDouble();
    if(num1 > num2){
      System.out.println(num1 + " is greater than " + num2);
    }else if(num2 > num1){
      System.out.println(num2 + " is greater than " + num1);
    }else{
      System.out.println("Both numbers are equal");
    }
  }
}
