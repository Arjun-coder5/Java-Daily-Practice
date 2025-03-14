import java.util.*;

public class Ques_12 {
  public static void main(String[] args) {
    //Power In Java
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base number:");
    int base = sc.nextInt();
    System.out.println("Enter power:");
    int power = sc.nextInt();
    int result = 1;
    for (int i = 0; i < power; i++) {
      result *= base;
    }
    System.out.println("Result: " + result);
    sc.close();

  }
}