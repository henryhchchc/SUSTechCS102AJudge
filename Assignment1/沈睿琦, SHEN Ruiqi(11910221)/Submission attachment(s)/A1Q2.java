import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1, h2, m1, m2, s1, s2, s3, s4, m3, s5, m;
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
        s3 = h1 * 3600 + m1 * 60 + s1;
        s4 = h2 * 3600 + m2 * 60 + s2;
        m = (s4 - s3) / 60;
        s5 = s4 - s3 - m * 60;
        if (m < 0) {
            System.out.print("you put the wrong number");
        }else if (s5==0&m==0){
            System.out.println(+m + "s");

        }
        else if (s5 == 0) {
            System.out.println(+m + "m");
        } else if (m == 0) {
            System.out.println(+s5 + "s");
        } else {
            System.out.println(+m + "m" + s5 + "s");
        }
    }
}


