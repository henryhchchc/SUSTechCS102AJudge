public class A1Q2 {
    public static void main(String[] args){
        int h1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int s1 = Integer.parseInt(args[2]);
        int h2 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int s2 = Integer.parseInt(args[5]);
        int n = (h2*3600+m2*60+s2) -(h1*3600+m1*60+s1);
        int m = n/60 ;
        int p = n%60 ;
        if(m == 0)
            System.out.printf("%d s", p);
        else
            if (p == 0)
                System.out.printf("%d m", m);
            else
                System.out.printf("%d m %d s", m, p);
    }
}
