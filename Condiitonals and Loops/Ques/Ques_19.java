import java.util.*;

public class Ques_19 {
  
 
  public static void main(String[] args) {
    //Find NCR and NPR : 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n and r : ");
    int n = sc.nextInt();
    int r = sc.nextInt();
    long ncr = factorial(n) / (factorial(r) * factorial(n - r));
    long npr = factorial(n) / factorial(n - r);
    System.out.println("NCR is : " + ncr);
    System.out.println("NPR is : " + npr);
    sc.close();





  }

    private static long factorial(int r) {
       long fact = 1;
       for (int i = 2; i <= r; i++) {
            fact *= i;
       }
       return fact;
    }
}

