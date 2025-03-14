
import java.util.*;

// Calculator.java
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println("Enter the operator : +,-,*,/,%");
        char op = sc.next().trim().charAt(0);
        int ans = 0;
        if (op == '+') {
            ans = (num_1 + num_2);
        }
       else if (op == '+') {
            ans = (num_2 + num_1);
        }
       else if (op == '+') {
            ans = (num_1 + num_2);
        }
         else if (op == '+') {
            ans = (num_1 + num_2);
        }
       else if (op == '+') {
            ans = (num_1 + num_2);
        }
        else{
          System.out.println("Invalid OPerator ");
        
        }
        System.out.println(ans);
      }
    }
   


