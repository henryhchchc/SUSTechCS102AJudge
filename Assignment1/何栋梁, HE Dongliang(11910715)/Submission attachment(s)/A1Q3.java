import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0 ,round ,n ,z;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double number = in.nextDouble();
            total = total + price * number;
            double y =total*10;
            y = (long)y;
            y = (float)y;
            round = y/10;
            n =(long)number;
            if(number-n==0.5){
                total++;
                round++;
            }
            z = ((double)((int)(total*100)-(int)(round*100)))/100;
            if (z >= 0.05) {
                total = round +0.1;
            }
            if ((z < 0.05) && (z >= 0)) {
                total = round;
            }
        }
        System.out.print(total);
    }
}