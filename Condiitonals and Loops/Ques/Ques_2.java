import java.util.*;
public class Ques_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().trim().charAt(0);
    if(ch>='a'&&ch<='z'){
      System.out.println("Lowercase character");
    }else if(ch<='A'&&ch<='Z'){
      System.out.println("Uppercase character");
    } else {
      System.out.println("Special character");
    }


  }
}
