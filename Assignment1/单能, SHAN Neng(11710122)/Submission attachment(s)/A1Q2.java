import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] beg = new int[3];
        beg [0] = input.nextInt();
        beg [1] = input.nextInt();
        beg [2] = input.nextInt();
        int[] end = new int[3];
        end [0] = input.nextInt();
        end [1] = input.nextInt();
        end [2] = input.nextInt();
        int s1 = beg [0]*3600 + beg [1]*60 + beg [2];
        int s2 = end [0]*3600 + end [1]*60 + end [2];
        int m = (s2 - s1)/60;
        int s = (s2 - s1)%60;
        if (m == 0 && s == 0)
            System.out.println("0s");
        else if (m == 0)
            System.out.println(s + "s");
        else if (s == 0)
            System.out.println(m + "m");
        else
            System.out.println(m + "m" + s + "s");
    }
}
