import java.util.Scanner;
public class A1Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int a1,a2,a3;
        int b1,b2,b3;

        int[]b=new int [3];
        int[] a =new int[3];
        for (int i=0;i<3;i++){
            int c=input.nextInt();
            a[i]=c;
        }

        a1=a[0];
        a2=a[1];
        a3=a[2];
        for(int i=0;i<3;i++){
            int d=input.nextInt();
            b[i]=d;
        }
        b1=b[0];
        b2=b[1];
        b3=b[2];
        int second=((b1-a1)*3600+(b2-a2)*60+b3-a3)%60;
        int minute=((b1-a1)*3600+(b2-a2)*60+b3-a3-second)/60;
        if (minute!=0 & second!=0){
            System.out.printf("%dm%ds",minute,second);
        }
        else if (minute!=0 ){
            System.out.printf("%dm",minute);
        }
        else if(second!=0){
            System.out.printf("%ds",second);
        }
        else System.out.println("0s");


    }
}
