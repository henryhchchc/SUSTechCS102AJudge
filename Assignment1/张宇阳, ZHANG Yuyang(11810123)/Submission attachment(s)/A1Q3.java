import java.util.Scanner;

public class A1Q3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double bill =0;
    while (in.hasNext()){
      double price = in.nextDouble();
      double amo = in.nextDouble();
      int num = (int)(amo / 1);
      double half = amo % 1;
      bill = bill + price * num;
      if(half == 0.5){
        bill = bill + Double.parseDouble(String.format("%.1f", price*0.5)) + 1;
      }
    }
    System.out.print(bill);
  }
}
