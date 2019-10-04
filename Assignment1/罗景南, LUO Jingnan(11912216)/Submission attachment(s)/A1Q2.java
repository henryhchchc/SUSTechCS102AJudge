public class A1Q2 {
    public static void main(String[]args){


        int h1=Integer.parseInt(args[0]);
        int m1=Integer.parseInt(args[1]);
        int s1=Integer.parseInt(args[2]);

        int h2=Integer.parseInt(args[3]);
        int m2=Integer.parseInt(args[4]);
        int s2=Integer.parseInt(args[5]);
        int X=(h2-h1)*3600+(m2-m1)*60+s2-s1;
        int minutes=X/60;
        int seconds=X%60;
        System.out.printf("%dm %ds",minutes,seconds);}}