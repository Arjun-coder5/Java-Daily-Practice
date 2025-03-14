import java.util.Scanner;

public class Ques_9 {
  public static void main(String[] args) {
    //Calculate Discount Of Product
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the price of the product: ");
    double price = sc.nextDouble();
    System.out.println("Enter the discount percentage: ");
    double discount = sc.nextDouble();
    double discountedPrice = price - (price * (discount / 100));

    System.out.println("The discounted price is: " + discountedPrice);

    //Calculate Total Cost Including Tax
    System.out.println("Enter the tax percentage: ");
    double tax = sc.nextDouble();
    double totalCost = discountedPrice + (discountedPrice * (tax / 100));
    System.out.println("The total cost including tax is: " + totalCost);
    sc.close();
    



  }
}
