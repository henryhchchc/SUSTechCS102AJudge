 import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int beginhour =sc.nextInt();
        int beginmin =sc.nextInt();
        int beginsec =sc.nextInt();
        int endhour =sc.nextInt();
        int endmin =sc.nextInt();
        int endsec =sc.nextInt();
        int begin =beginhour*3600+beginmin*60+beginsec;
        int end =endhour*3600+endmin*60+endsec;
        int A =end -begin;
            if(A/60==0){
                System.out.print(A+"s");
            }
            else if(A%60!=0){
                System.out.print(A/60+"m"+(A-A/60*60)+"s");
            }
            else {
                System.out.print(A/60+"m");
            }

    }
}
