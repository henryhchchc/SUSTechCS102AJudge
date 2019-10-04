import java.util.Scanner;

public class A1Q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int s1 = scan.nextInt();
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int s2 = scan.nextInt();
        scan.close();
        int time = 3600*(h1-h2)+60*(m1-m2)+(s1-s2);
        int m = time%60;
        int s = (time-06*m);
        if(m!=0&&s!=0){
            System.out.println(m+"m"+s+"s");
        }
        if(m!=0&&s==0){
            System.out.println(m+"m");
        }
        if(m==0&&s!=0){
            System.out.println(s+"s");
        } 
        if(m==0&&s==0){
            System.out.println("0s");
        }
        
        }
}