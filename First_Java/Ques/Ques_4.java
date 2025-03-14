
import java.util.Scanner;


public class Ques_4 {
  public static void main(String[] args) {
    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double num1 = sc.nextDouble();
    System.out.println("Enter second number: ");
    double num2 = sc.nextDouble();
    System.out.println("Enter operator: ");
    char operator = sc.next().charAt(0);
    double result = 0;
    if(operator == '+'){
      result = num1 + num2;
    }else if(operator == '-'){
      result = num1 - num2;
    }else if(operator == '*'){
      result = num1 * num2;
    }else if(operator == '/'){
      result = num1 / num2;
    }else if(operator == '%'){
      result = num1 % num2;
    }else if(operator == '^'){
      result = Math.pow(num1, num2);
    }else{
      System.out.println("Invalid Operator");
    }
    System.out.println("Result: " + result);
    sc.close();

  }
}
