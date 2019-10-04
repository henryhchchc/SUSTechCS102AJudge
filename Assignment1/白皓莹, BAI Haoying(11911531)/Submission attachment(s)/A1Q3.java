import java.util.Scanner;

public class A1Q3 {
    public static void main (String[] args){
        double a,b,c=0;
        double sum=0;
        double sum1=0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            a = input.nextDouble();
            b = input.nextDouble();
            c=b - Math.floor(b);
            if ( c!= 0.5) {
                sum = sum+(a*b);
            }
            else if (c == 0.5) {
                sum1 = a/2 + 1;
                sum1 = Math.round(sum1*10)/10;
                sum = sum +(sum1+a*Math.floor(b));

            }
        }
        System.out.printf("%.1f",sum);
    }
}