import java.util.Scanner;
public class A1Q3{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double all,c,d,e;
        all=0.0;
        while (input.hasNext()){
            double price=input.nextDouble();
            double number=input.nextDouble();
            double a=2*number;
            int b=(int)a;
            if(b%2<1){
                all+=price*number;
            }
            else {
                c = price * number * 10;
                d = Math.round(c);
                e = d / 10;
                all += e + 1;
            }



        }
        System.out.printf("%.1f",all);


    }

}
