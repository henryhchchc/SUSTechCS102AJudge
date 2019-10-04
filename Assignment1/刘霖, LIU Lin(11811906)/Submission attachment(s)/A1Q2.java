 import java.util.Scanner;
    public class A1Q2 {
        public static void main(String []args) {
            int h;
            int m;
            int s;
            int a;
            int b;
            int c;

            Scanner input = new Scanner(System.in);
            System.out.print("");
            h = input.nextInt();

            m = input.nextInt();

            s = input.nextInt();

            System.out.print("");
            a = input.nextInt();

            b = input.nextInt();

            c = input.nextInt();


            int i = 1;
            int j = 1;
            int k = 1;

            if(a <= 23 && b <= 59 && c <= 59 && h <= 23 && m <= 59 && s <= 59) {
                i = a * 3600 + b * 60 + c - h * 3600 - m * 60 - s;
                j = i/60;
                k = i - j * 60;

                    if (j == 0 && k == 0)
                        System.out.print("0s");
                    else if (j == 0 && k > 0)
                        System.out.printf("%2ds", k);
                    else if (j > 0 && k == 0)
                        System.out.printf("%2dm", j);
                    else if (j > 0 && k > 0)
                        System.out.printf("%2dm%2ds", j, k);
                    else
                        System.out.print("Wrong!");

            }else
                System.out.print("Wrong!");
        }
    }

