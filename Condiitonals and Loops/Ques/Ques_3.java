import java.util.*;


public class Ques_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    System.out.println("Enter the number :");
    int n = sc.nextInt();
    for (int i = 0; i <=n;i++) {
      int temp = b;
      b = b+a;
      a = temp;
      
      
  }
  System.out.println(a);
}
}