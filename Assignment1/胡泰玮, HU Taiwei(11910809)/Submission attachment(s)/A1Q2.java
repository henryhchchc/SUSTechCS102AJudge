
import java.util.Scanner;
public class A1Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int hh1 = input.nextInt();
        int mm1 = input.nextInt();
        int ss1 = input.nextInt();
        int hh2 = input.nextInt();
        int mm2 = input.nextInt();
        int ss2 = input.nextInt();
        int h,m,s,tots;
        s = ss2-ss1;
        m = mm2-mm1;
        h = hh2-hh1;
        tots=s+(m*60)+(h*60*60);
        m = tots/60;
        s = tots%60;
        if(s==0){
        System.out.printf("%ds",m);
    }
        else if(m==0){
            System.out.printf("%ds",s);
        }
        else{
        System.out.printf("%dm%ds",m,s);
    }




}

}
