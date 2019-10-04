import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double price ;
        double piece ;
        double total = 0;
        while (in.hasNext()){
            price = in.nextDouble();
            piece = in.nextDouble();
            if (piece-(int)piece !=0) {
                price = (int)piece*price+(price / 2 + 1)+0.05;
            }else price = piece*price;
            total += price;
        }
        System.out.printf("%.1f",total);
    }
}
