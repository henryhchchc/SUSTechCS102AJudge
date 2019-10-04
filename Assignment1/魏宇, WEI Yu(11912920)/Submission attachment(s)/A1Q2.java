import java.util.Scanner;
public class A1Q2{
    public static void main(String[] args) {
    Scanner lover = new Scanner(System.in);
        System.out.println("please input your start hour:");
        int shour = lover.nextInt();
        System.out.println("please input your start minute:");
        int smin  = lover.nextInt();
        System.out.println("please input your start second:");
        int ssec  = lover.nextInt();
        System.out.println("please input your finish hour:");
        int fhour = lover.nextInt();
        System.out.println("please input your finish minute:");
        int fmin  = lover.nextInt();
        System.out.println("please input your finish second:");
        int fsec  = lover.nextInt();

        int wmin = (fhour-shour)*60+(fmin-smin);
        int wsec = fsec-ssec;
        if(ssec>=fsec){
            wmin--;
            wsec+=60;
            System.out.printf("%dm%ds",wmin,wsec);
        }else{
            System.out.printf("%dm%ds",wmin,wsec);
        }

    }
}
