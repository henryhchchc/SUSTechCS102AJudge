import java.util.Scanner;

public class A1Q3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double tottle = 0;
        while(in.hasNext()){
            double price = in.nextDouble();
            double dishes = in.nextDouble();
            tottle = tottle + price * Math.floor(dishes)+ (dishes - Math.floor(dishes)) * 2 * Math.round( (price / 2 + 1) * 10) / 10;
        }
        System.out.print(tottle);
    }
}
