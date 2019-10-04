package fjq;

import java.util.Scanner;

public class A1Q2 {

    public static void calculate(String start, String end) {
        int h = 0;
        int m = 0;
        int s = 0;
        h =  Integer.parseInt(end.split("\\s+")[0]) - Integer.parseInt(start.split("\\s+")[0]);
        m =  Integer.parseInt(end.split("\\s+")[1]) - Integer.parseInt(start.split("\\s+")[1]);
        s =  Integer.parseInt(end.split("\\s+")[2]) - Integer.parseInt(start.split("\\s+")[2]);
        m = m + h * 60;
        if ( m == 0) {
            System.out.println( s +"s");
        } else if ( s == 0) {
            System.out.println(m + "m" );
        } else {
            System.out.println(m + "m" + s +"s");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String timeStart  = in.nextLine();
            String timeEnd = in.nextLine();
            calculate(timeStart, timeEnd);
        }

    }
}
