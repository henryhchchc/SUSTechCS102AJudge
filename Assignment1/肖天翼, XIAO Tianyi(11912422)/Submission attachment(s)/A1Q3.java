import java.util.Scanner;
public class A1Q3 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        double t=0;
        while (input.hasNext()){
            double price=input.nextDouble();
            double a=input.nextDouble();
            if (a%1<0.1){
            t=t+price*a;
            }
            else {
                t=t+(price*(Math.floor(a))+(Math.round(price*0.50)+1));
            }
        }
        System.out.print(Math.round(t*10)/10.0);
    }
}
