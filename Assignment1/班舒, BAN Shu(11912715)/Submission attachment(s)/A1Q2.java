import java.util.Scanner;

public class A1Q2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
//        String name = args[0];
//        int age = Integer.parseInt(args[1]);
//        double weight = Double.parseDouble(args[1]);
//        System.out.println(age);
//        System.out.println(weight);
            int a = in.nextInt();
            int b = in.nextInt();
            int c =in.nextInt();
            int d =in.nextInt();
            int e =in.nextInt();
            int f =in.nextInt();
            int time1;int time2;
            time1 = a*3600 +b*60 +c;
            time2 = d*3600 +e*60 +f;

            System.out.println((time2-time1)/60+"m"+(time2-time1)%60+"s");


        }
    }
