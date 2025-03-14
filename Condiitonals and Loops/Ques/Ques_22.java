

import java.util.*;
public class Ques_22 {
  public static void main(String[] args) {
    //HCF of Two numbers ://-
    // HCF of Two numbers ://+
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number : ");
    int num2 = sc.nextInt();
    int hcf = findHCF(num1, num2);
    System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    sc.close();
  }//

    private static int findHCF(int num1, int num2) {
        while (num2!=0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
  }
