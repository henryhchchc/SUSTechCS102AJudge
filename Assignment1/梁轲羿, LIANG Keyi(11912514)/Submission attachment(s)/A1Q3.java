import java.util.Scanner;

public class A1Q3 {
    public static void main(String []args){
        double total=0;
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            double price=scan.nextDouble();
            double num=scan.nextDouble();
            double x=num*2;
            double remainder=x%2;
            if (remainder==1.0){
                total=total+price*num+1;
            }
            if(remainder==0.0){
                total=total+price*num;
            }


        }
        System.out.print(total);



    }

}
