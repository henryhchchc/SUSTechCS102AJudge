import java.util.Scanner;
public class A1Q2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a[] = new int [6],min,sec;

        for(int i = 0; i < 6; ++i){

             a[i]=input.nextInt();
        }
        min=(a[3]-a[0])*60+a[4]-a[1];
        sec = a[5]-a[2];

        if (sec<0&&min>=0){
            min--;sec+=60;
        }
        if (min!=0)System.out.printf("%dm",min);
        if (sec!=0)System.out.printf("%ds",sec);
        if (min==0&&sec==0)System.out.printf("%ds",sec);

    }
}