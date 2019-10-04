import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();
        int g,h,i,j,k,l;
        g=(d-a)*60;
        h=e-b;
        i=f-c;
        j=h+g;
        k=j-1;
        l=60+i;
        if(j>0&&i>0)
            System.out.printf("%dm%ds\n",j,i);
        else if(i<0)
            System.out.printf("%dm%ds\n",k,l);
        else if(h==0)
            System.out.printf("%ds\n",i);
        else if(i==0)
            System.out.printf("%dm\n",j);
        }


    }
