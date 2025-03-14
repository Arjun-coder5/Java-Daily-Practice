import java.util.Scanner;



public class Ques_7 {
  public static void main(String[] args) {
    //To find out whether the given String is Palindrome or not.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: "); 
    String str = scanner.nextLine();
    String rev = "";
    for(int i = str.length()-1; i >= 0; i--){
      rev = rev + str.charAt(i);
    }
    if(str.equals(rev)){
      System.out.println("Given string is a Palindrome");
    }else{
      System.out.println("Given string is not a Palindrome");
    }
    scanner.close();

  }
}
