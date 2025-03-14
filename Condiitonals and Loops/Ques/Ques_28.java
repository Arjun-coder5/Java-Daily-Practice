import java.util.*;
public class Ques_28 {
  public static void main(String[] args) {
  //Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of days in August:");

    int daysInAugust = sc.nextInt();
    int daysAllowedToGoOut = 0;
    for (int day = 1; day <= daysInAugust; day++) {
      if (day % 2 == 0) {
        daysAllowedToGoOut++;
      }
    }
    System.out.println("Kunal can go out on " + daysAllowedToGoOut + " even days in August.");
    sc.close();
  }
}