import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h01 = 0, m01 = 0, s01 = 0;
        int h02 = 0, m02 = 0, s02 = 0;
        int h11 = 0, m11 = 0, s11 = 0;

        h01 = input.nextInt();
        m01 = input.nextInt();
        s01 = input.nextInt();
        h02 = input.nextInt();
        m02 = input.nextInt();
        s02 = input.nextInt();

        if ((h02 * 3600 + m02 * 60 + s02) - (h01 * 3600 + m01 * 60 + s01) > 0) {
            s11 = ((h02 * 3600 + m02 * 60 + s02) - (h01 * 3600 + m01 * 60 + s01)) % 60;
            m11 = ((h02 * 3600 + m02 * 60 + s02) - (h01 * 3600 + m01 * 60 + s01)) / 60;
        } else {
            s11 = ((h01 * 3600 + m01 * 60 + s01) - (h02 * 3600 + m02 * 60 + s02)) % 60;
            m11 = ((h01 * 3600 + m01 * 60 + s01) - (h02 * 3600 + m02 * 60 + s02)) / 60;
        }
        if ( s11 > 0 && m11 > 0 )
            System.out.printf("%dm%ds\n" , m11 , s11 );
        else if ( s11 > 0 && m11 == 0 )
            System.out.printf("%ds\n" , s11);
        else if ( s11 == 0 && m11 == 0 )
            System.out.printf("%ds\n" , s11);
        else if ( s11 == 0 && m11 > 0 )
            System.out.printf("%dm\n" , m11);


    }
}