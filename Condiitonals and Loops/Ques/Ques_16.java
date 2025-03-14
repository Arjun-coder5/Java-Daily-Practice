import java.util.*;

public class Ques_16 {
  public static void main(String[] args) {
    // Calculate Avg marks :

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the marks of student " + (i + 1) + ": ");
      int marks = sc.nextInt();
      sum += marks;
    }
    double avgMarks = (double) sum / n;
    System.out.println("Average marks: " + avgMarks);
    
  }
}
