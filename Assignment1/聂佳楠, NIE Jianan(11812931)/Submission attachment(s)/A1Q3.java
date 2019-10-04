import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        double out;out=0;
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            double price=input.nextDouble();
            double n=input.nextDouble();n=2*n;
            int i = (new Double(n)).intValue();

            if(i%2==0)
                out+=Math.round(10*i*price/2);
            else
                out+=Math.round((price*(i-1)/2+(price)/2+1)*10);
        }
        out=out/10;
        System.out.printf("%.1f",out);

}}
