import java.util.*;

public class Ques_15 {
  public static void main(String[] args) {
    //Calculate cgpa  :  

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects: ");
    int n = sc.nextInt();
    double sum = 0;
    double totalCredits = 0;
    double cgpt;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter subject " + (i + 1) + " name: ");
      String subjectName = sc.next();
      System.out.println("Enter subject " + (i + 1) + " credit hours: ");
      double creditHours = sc.nextDouble();
      System.out.println("Enter subject " + (i + 1) + " grade: ");
      char grade = sc.next().charAt(0);
      double gradePoints;
      switch (grade) {

        case 'A':
          gradePoints = 4.0;
          break;
        case 'B':
          gradePoints = 3.0;
          break;
        case 'C':
          gradePoints = 2.0;
          break;
        case 'D':
          gradePoints = 1.0;
          break;
        case 'F':
          gradePoints = 0.0;
          break;
        default:
          System.out.println("Invalid grade. Please enter a valid grade (A, B, C, D, F).");
          return;

          }
      sum += gradePoints * creditHours;
      totalCredits += creditHours;

      }
      double cgpa = sum / totalCredits;
     

    System.out.println("Your CGPA is: " + cgpa);
    sc.close();
    
    

  }
}