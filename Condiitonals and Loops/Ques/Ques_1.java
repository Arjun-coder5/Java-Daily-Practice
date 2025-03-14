import java.util.*;
class Ques_1{
  public static void main(String[] args) {
    // Largest number finder  :
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the number a");
     int a = sc.nextInt();
    System.out.println("Enter the number b");
     int b = sc.nextInt();
    System.out.println("Enter the number c");
     int c = sc.nextInt();
//Method 1 :
    // int max =Math.max(c,Math.max(a,b));
    // System.out.println("So the Max number is" + max);
//Method 2 :
//  int max = a;
//     if(b > max)
//       max = b;
//     if(c > max)
//       max = c;
//     System.out.println("So the Max number is" + max);
//Method 3:
// if(a>b&&a>c){
//   System.out.println("Max " + a);
// }else if(b>c&&b>a){
//   System.out.println("Max "+b);
// }else{
//   System.out.println("Max "+ c );
// }

//   }
// }
  }
}