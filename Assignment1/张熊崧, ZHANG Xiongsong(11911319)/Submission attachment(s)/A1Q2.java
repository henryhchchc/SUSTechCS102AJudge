

import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,f;
        int sum1;
        int sum2;
        int i = 0;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();
        sum1 = a *3600 +b*60 +c ;
        sum2 = d *3600 +e*60 +f;
        int x=sum2-sum1;
        int y =  x/60;
        int z =  x%60;


        if((y==0)||(z==0)){
            if(z==0){
                if(y==0){
                    System.out.printf("%ds",y,z);}
                    else{
                        System.out.printf("%dm",y);

                    }

            }
            else{
                System.out.printf("%ds",z);}
        }
        else
            {System.out.printf("%dm%ds",y,z);
            }



    }




}
