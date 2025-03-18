import java.util.Scanner;
public class Ques_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects : ");
    int count = sc.nextInt();
    
    int result = 0; // Initialize result outside the loop
    for(int i = 0 ; i < count ; i++){ // Change condition to i < count
      System.out.println("Enter the marks of subject " + i);
      result += sc.nextInt(); // Update result here

    }
    System.out.println("Total marks : " + result);

    int percentage = result / count;
    System.out.println("The result is :" + percentage);
    switch (percentage / 10) {
      
      case 1:
        System.out.println("Grade : A");
        break;
      case 2:
        System.out.println("Grade : B");
        break;
      case 3:
        System.out.println("Grade : C");
        break;
      case 4:
        System.out.println("Grade : D");
        break;
      default:
        System.out.println("Grade : F");
        break;
    }


  }
}

