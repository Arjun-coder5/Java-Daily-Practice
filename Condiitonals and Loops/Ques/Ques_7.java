import java.util.*;


public class Ques_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int unit = sc.nextInt();
    long billpay = 0;
    if(unit<100){
      billpay = (long) ((unit-100)*1.20);
    }else if(unit<300){
      billpay = (long) (100*1.20+(unit-100)*2);

    }else{
      billpay = (long) (100*1.20+200*2+(unit-300)*3);
    }
    System.out.println("Bill_pay: " + billpay);

  }
}
