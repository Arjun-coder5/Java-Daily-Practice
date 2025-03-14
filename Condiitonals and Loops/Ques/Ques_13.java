import java.util.*;

public class Ques_13 {
  public static void main(String[] args) {
    //Calculate depreciation of value 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the initial value: ");
    double initialValue = sc.nextDouble();
    System.out.println("Enter the depreciation rate per annum: ");
    double depreciationRate = sc.nextDouble();
    System.out.println("Enter the number of years: ");
    int years = sc.nextInt();
    double depreciation = initialValue * depreciationRate * years;
    System.out.println("The total depreciation over " + years + " years is: " + depreciation);
    sc.close();
  }
}