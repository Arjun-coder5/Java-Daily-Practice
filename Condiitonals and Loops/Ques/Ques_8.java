import java.util.*;




public class Ques_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element: ");
    int N = sc.nextInt();
    int sum = 0;
    System.out.println("Enter  " +N+ " elements ");
    
    for (int i = 0; i < N; i++) {

      double num = sc.nextDouble();
      sum +=num;
  }

  double avg  = sum/N;
  System.out.println("The avg Of " +N+ " numbers is: " +avg);
}
}




