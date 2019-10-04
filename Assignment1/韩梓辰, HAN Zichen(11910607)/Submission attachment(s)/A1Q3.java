import java.util.*;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,sum,m,p;sum=0;
        while (input.hasNext()){
            n=input.nextDouble();
            m=input.nextDouble();
            if (m%1!=0){
                p=(double) (Math.round( m*n*10))/10+1;
            }
            else {
            p=(double) (Math.round( m*n*10))/10;}
            sum=sum+p;
        }
        System.out.printf("%.1f",sum);
    }
}
