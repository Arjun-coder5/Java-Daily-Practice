import java.util.*;

public class Ques_10 {
  public static void main(String[] args) {
    //Calculate Distance Between Two Points
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x-coordinate of point 1:");

    int x1 = sc.nextInt();
    System.out.println("Enter the y-coordinate of point 1:");
    int y1 = sc.nextInt();
    System.out.println("Enter the x-coordinate of point 2:");
    int x2 = sc.nextInt();
    System.out.println("Enter the y-coordinate of point 2:");
    int y2 = sc.nextInt();
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println("The distance between the two points is: " + distance);

  }
}
