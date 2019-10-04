import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double c=0;
        while (in.hasNext()){
            double price=in.nextDouble();
            double times=in.nextDouble();
            double total;
            if (times%1==0)
                total=(price*times)*10;
            else {
                total = Math.round((price * (times % 1) + price * (times - times % 1) + 1)*10);
            }
            c+=(total);
        }
        System.out.print(c/10);
    }
}
