import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        double price = 0;
        double piece = 0;
        double sum = 0;

        while (in.hasNext()){
            price = in.nextDouble();
            piece = in.nextDouble();
            if (Math.round(piece) == piece){
                sum += (price * piece);
            }else {
                sum += (price * (piece - 0.5));
                sum += (Math.round(price * 5)/10 + 1);
            }
        }
        System.out.print(sum);
    }
}
