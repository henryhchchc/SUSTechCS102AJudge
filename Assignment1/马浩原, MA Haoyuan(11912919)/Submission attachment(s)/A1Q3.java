import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double sum=0;
        while(in.hasNext()){
            double p = in.nextDouble();
            double n = in.nextDouble();
            p=Math.floor(10*p)/10;
            n=Math.floor(10*n)/10;

            if(Math.floor(n)==n){
                sum=sum+p*n;
            }else{
                sum=sum+p*Math.floor(n)+Math.round(p/2)+1;
            }
        }
        System.out.println(sum);

    }
}
