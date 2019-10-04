import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
        int a,b,c,d,e,f,g,i,m;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        f=input.nextInt();
        g=(d-a)*3600+(e-b)*60+(f-c);
        i=g/60;m=g%60;
        if(i!=0&&m!=0){
            System.out.printf("%sm%ss",i,m);
        }
        else if(i!=0&&m==0){
            System.out.printf("%sm",i);
        }
        else if(i==0&&m==0){
            System.out.printf("0s");
        }
        else{
            System.out.printf("%ss",m);
        }
    }
}