import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner time = new Scanner(System.in);
        int h1,h2,m1,m2,s1,s2;
        int ws;
        int wm;


        h1=time.nextInt();
        m1=time.nextInt();
        s1=time.nextInt();
        h2=time.nextInt();
        m2=time.nextInt();
        s2=time.nextInt();

        ws= (h2-h1)*3600 + (m2-m1)*60 + (s2-s1);
        wm = ws/60;
        ws=ws%60;

        if(ws==0 && wm==0){
            System.out.print("0s");
        }
        else if(ws==0 && wm!=0){
            System.out.printf("%dm",wm);
        }
        else if(ws!=0 && wm==0){
            System.out.printf("%ds",ws);
        }
        else{
            System.out.printf("%dm%ds",wm,ws);
        }
    }
}