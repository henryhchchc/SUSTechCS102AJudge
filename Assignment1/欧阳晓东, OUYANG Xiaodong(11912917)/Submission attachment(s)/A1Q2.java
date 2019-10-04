import java.util.Scanner;
public class  A1Q2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y;
        int m=0;
        int n=0;
        int x=0;
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (x == 0) {
                m = a * 3600 + b * 60 + c;
            } else {
                n = a * 3600 + b * 60 + c;
            }
            x = x + 1;
        }
        x = (n - m) / 60;
        y = (n - m) % 60;
        if(x==0&&y==0) {
            System.out.printf("0s");
        }
        else if(x==0&&y!=0) {
            System.out.printf("%ds", y);
        }
        else if (x!=0&&y==0){
            System.out.printf("%dm", x);
        }
        else {
            System.out.printf("%dm%ds", x, y);
        }
    }
    }

