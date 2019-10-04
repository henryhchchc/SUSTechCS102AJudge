import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner Homework = new Scanner(System.in);
        int a,b,c,d,e,f,g,h;
        a = Homework.nextInt();
        b = Homework.nextInt();
        c = Homework.nextInt();
        d = Homework.nextInt();
        e = Homework.nextInt();
        f = Homework.nextInt();
        g = (d*3600+e*60+f-a*3600-b*60-c)/60;
        h = (d*3600+e*60+f-a*3600-b*60-c)%60;
        if( g!=0 && h!=0){
            System.out.printf("%dm%ds",g,h);
        }
        else {
            if( g!=0 && h==0){
                System.out.printf("%dm",g);
            }
            else {
                System.out.printf("%ds",h);

            }
        }


    }
}
