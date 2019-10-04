import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time[] = new int[6];
        int i=0;
        while (i!=6)
        {time[i]=scan.nextInt();
        i++;
        }
        int m0=(-time[0]+time[3])*60-time[1]+time[4];
        int s0=-time[2]+time[5];
        int m,s;
        s=(m0*60+s0)%60;
        m=(m0*60+s0)/60;
        if(m==0)System.out.printf("%ds\n",s);
        else if (s==0) System.out.printf("%dm\n",m);
        else System.out.printf("%dm%ds",m,s);
        }
    }