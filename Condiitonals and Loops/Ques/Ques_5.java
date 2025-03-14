import java.util.*;

public class Ques_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int ans = 0;
    while(n>0){
      int rem = n%10;
      ans = ans*10+rem;
      n/=10;
    }


    System.out.println("The reverse number is  : "+ans);
    }
}
