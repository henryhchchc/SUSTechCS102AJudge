import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double piece,price,s,i,sum=0,half=0;
        int p,h;

        while(input.hasNext()){
            price = input.nextDouble();
            piece = input.nextDouble();

            p=(int)piece;

                if (p == piece)
                    s = price * p;
                else{
                    half = price * (piece - p) + 1;
                h = (int) Math.round(half);
                i = price * p;
                s = h + i;
                //System.out.printf("s is %.1f\n",s);
            }//single dish

            sum += s;
        }
        System.out.printf("%.1f",sum);
    }}
