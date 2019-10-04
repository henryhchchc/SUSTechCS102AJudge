import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
      double sum = 0;
      double s1 = 0;
    while(in.hasNext()){
      double price = in.nextDouble();
      double piece = in.nextDouble();
      s1 =  (Math.round( (price * piece) * 10 ) / 10.0);
    if(piece % 1 > 0){
        sum = sum +  s1 + 1;
        }
    else{
        sum = sum + s1;
    }
    }System.out.printf("%.1f" , sum );
    }

}
