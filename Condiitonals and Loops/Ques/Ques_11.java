import java.util.*;

public class Ques_11 {
  public static void main(String[] args) {
    //Calculate Commission Percentage
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sales amount: ");
    double salesAmount = sc.nextDouble();
    double commissionPercentage;
    if (salesAmount >= 50000) {
      commissionPercentage = 0.15;
    } else if (salesAmount >= 30000 && salesAmount < 50000) {
      commissionPercentage = 0.12;
    } else {
      commissionPercentage = 0.08;
    }
    double commissionAmount = salesAmount * commissionPercentage;
    System.out.println("Commission Amount: " + commissionAmount);
    

  }
}