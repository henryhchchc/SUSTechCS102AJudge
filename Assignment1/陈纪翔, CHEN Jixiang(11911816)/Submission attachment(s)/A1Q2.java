import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
	// write your code here
        Scanner ip=new Scanner(System.in);
        int a=0,b=0;
        a+=ip.nextInt()*3600;
        a+=ip.nextInt()*60;
        a+=ip.nextInt();
        b+=ip.nextInt()*3600;
        b+=ip.nextInt()*60;
        b+=ip.nextInt();
        int c=b-a;
        if(c<60)  System.out.printf("%ds",c);
        else if(c%60==0)    System.out.printf("%dm",c/60);
        else System.out.printf("%dm%ds",c/60,c%60);
    }
}
