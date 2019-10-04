import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int zf;
        double w=0;
        double bf;
        int priceb;
        while(in.hasNext()){
            double price=in.nextDouble();
            double m=in.nextDouble();
            zf=(int)(m);
            bf=m-zf;
            w=w+zf*price;
            priceb=(int)(Math.round(price/2+1));
            if(bf==0.5){
                w=w+priceb;
                bf=0;
            }
        }
        System.out.println(w);
    }
}
