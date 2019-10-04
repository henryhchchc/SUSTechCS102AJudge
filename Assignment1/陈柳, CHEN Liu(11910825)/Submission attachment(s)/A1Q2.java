
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
System.out.println("please enter the start time and the end time\n");

        int H1,M1,S1,H2,M2,S2;

        H1  = in.nextInt();
        M1  = in.nextInt();
        S1  = in.nextInt();
        H2  = in.nextInt();
        M2  = in.nextInt();
        S2  = in.nextInt();
        int S3,S4, S43, M5,S5;
S3=H1*3600+M1*60+S1;
S4=H2*3600+M2*60+S2;
S43=S4-S3;
M5=S43/60;
S5=S43%60;
System.out.printf("%dm%ds",M5,S5);

    }
}
