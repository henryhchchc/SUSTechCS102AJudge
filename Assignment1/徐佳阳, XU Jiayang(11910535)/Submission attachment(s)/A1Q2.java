import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int s1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();
        int minute;
        int second;
        if ((s2 - s1) >=0) {
            minute = (m2 - m1) + (60 * (h2 - h1));
            second = s2 - s1;
            if (s2 - s1 > 0) {
                System.out.print(minute+"m"+second+"s");
            }
            if (s2 - s1 == 0){
                if (minute==0)
                    System.out.println(second+"s");
                else System.out.println(minute + "m");
            }
        } else if (s2-s1<0) {
                second = (60 + s2) - s1;
                minute = (m2 - m1 - 1) + (60 * (h2 - h1));
                System.out.println(minute + "m" + second + "s");
        }}}
