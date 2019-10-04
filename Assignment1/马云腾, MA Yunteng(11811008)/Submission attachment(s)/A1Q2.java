import java.util.Scanner;

public class A1Q2 {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int H=input.nextInt();
        int M=input.nextInt();
        int S=input.nextInt();
        int h=input.nextInt();
        int m=input.nextInt();
        int s=input.nextInt();
        int a=h-H,St=3600*a+(m-M)*60+s-S,m1=St/60,s1=St%60;
        if (m1!=0&&s1!=0){
            System.out.printf("%dm%ds",m1,s1);
        }
            else if (m1==0){
                System.out.printf("%ds",s1);
        }
            else if (s1==0){
                System.out.printf("%dm",m1);
        }


        }
    }


