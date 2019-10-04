import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      double total =0;
      while(in.hasNext()) {

          double price = in.nextDouble();
          double piece = in.nextDouble();

          if (piece - Math.floor(piece) > 0)
              total += price * Math.floor(piece) +Math.round(0.5*price)+1;
          else
              total += price * piece ;
          }

        System.out.printf("%.1f ", total);

      }
}
