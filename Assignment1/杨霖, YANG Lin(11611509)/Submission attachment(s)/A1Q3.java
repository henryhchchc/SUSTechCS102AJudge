import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while (input.hasNext()) {
            double price = input.nextDouble();
            double piece = input.nextDouble();
            int b = (int) (piece / 1);//System.out.printf("b=%d ",b);
            double c = piece - b;//System.out.printf("c=%f ",c);
            if (c == 0.5) {
                double n = (price * b) + ((price / 2) + 1);//System.out.printf("n=%f ",n);
                double i = n % 0.1;//System.out.printf("i=%f ",i);
                double j = n / 0.1;//System.out.printf("j=%f ",j);
                if (i >0.0499) n =( ((int) j + 1) / 10.0); //System.out.printf("yyx n=%f ",n);}
                else n =( (int) j / 10.0);//System.out.printf("yl n=%f ",n);}
                total += n;
            }
            //System.out.printf("%f ",total);}
            else if (c == 0) {
                total += price * b;
            }
            //System.out.printf("%f ",total);}
            else {
                System.out.printf("WRONG PIECE");
                System.exit(-1);
            }
        }
        System.out.printf("%.1f", total);
    }

}
