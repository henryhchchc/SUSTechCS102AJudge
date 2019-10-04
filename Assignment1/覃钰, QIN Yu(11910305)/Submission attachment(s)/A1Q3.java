import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double t=0.;
while(input.hasNext()){
    double prise=input.nextDouble();
    double i=input.nextDouble();
    if(i==(int)i){
        t=t+i*prise;
    }
    else{
        double c=prise*5;
        c=Math.round(c);
        c=c/10;
        t=t+(i-0.5)*prise+c+1;
    }
}
System.out.printf("%.1f",t);
    }
}