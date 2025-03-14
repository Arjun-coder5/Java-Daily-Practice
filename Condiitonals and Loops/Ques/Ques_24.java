import java.util.*;

public class Ques_24 {
  public static void main(String[] args) {
    // vowel or consonent: 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character : ");
    char ch = sc.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
      System.out.println("Character is a vowel");
    } else{
      System.out.println("Character is a consonant");
    }

    
  }
}
