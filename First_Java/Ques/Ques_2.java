import java.util.*;

public class Ques_2 {
  public static void main(String[] args) {
    //Take name as input and print a greeting message for that particular name
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
    sc.close();
  }
}
