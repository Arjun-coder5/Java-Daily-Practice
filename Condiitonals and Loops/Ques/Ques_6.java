import java.util.*;

public class Ques_6 {
  public static void main(String[] args) {
    // Factorial Programme : 

    Scanner sc = new Scanner(System.in);
    int fact = 1;
   int num = sc.nextInt();
   for (int i = num; i >=1; i--) {
    fact = fact*i;


   


  }
  System.out.println(fact);
}
}