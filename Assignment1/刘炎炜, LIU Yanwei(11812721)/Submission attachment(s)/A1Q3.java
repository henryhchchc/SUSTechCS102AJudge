import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        double t=0;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double p = in.nextDouble();
            double n = in.nextDouble();
            if (n%1!= 0){
                t += p*(Math.floor(n)) + (Math.round(p/2)+1);
            }else {
                t += p * n ;
            }
        }
        System.out.printf("%.1f\n",t);

    }
}
