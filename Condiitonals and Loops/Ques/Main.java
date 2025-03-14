

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //Reversing a string in Java : 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = sc.nextLine();
    // StringBuilder sb = new StringBuilder(str);
    // String reverse = sb.reverse().toString();
    // // new method :
    // System.out.println("Reversed string is : "+reverse);
    // // old method :
    // char[] charArray = str.toCharArray();
    // StringBuilder reverse1 = new StringBuilder();
    // for (int i = charArray.length - 1; i >= 0; i--) {
    //   reverse1.append(charArray[i]);
    // }
    // System.out.println("Reversed string is : "+reverse1.toString());
    // // more methods :
    // String reversed2 = new StringBuilder(str).reverse().toString();
    // System.out.println("Reversed string is : "+reversed2);
    // sc.close();
    //more method :
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    System.out.println("Reversed string is : "+reverse);
    
  }
}
  