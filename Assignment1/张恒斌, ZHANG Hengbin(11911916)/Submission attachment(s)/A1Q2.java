import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        int h1=0,m1=0,s1=0;
        int h2=0,m2=0,s2=0;
        int m=0;

        Scanner input = new Scanner(System.in);

        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();

        long timeLag = h2*3600 + m2*60 + s2 - h1*3600 - m1*60 - s1;
        while(timeLag >= 60){
            timeLag-=60;
            m++;
        }
        if(m > 0){
            System.out.printf("%dm",m);
        }
        if(timeLag > 0){
            System.out.printf("%ds",timeLag);
        }
        if(m==0 & timeLag==0){
            System.out.printf("%ds",timeLag);
        }
        if(timeLag < 0){
            System.out.print("No Solution");
        }
    }
}
