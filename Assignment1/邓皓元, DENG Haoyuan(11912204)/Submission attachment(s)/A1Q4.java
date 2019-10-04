public class A1Q4 {
    public static void main(String[] args) {
        int d=args.length;
        int a=d;
        int t=0;
        int b=0;
        int c=0;
        while(d>0){
            int x=Integer.parseInt(args[t]);
            c=c+x;
            if (x>b)
                b=x;
            t=t+1;
            d=d-1;
        }
        if (a>=10&&c>=5000||b>=8000)
            System.out.println("Diamond");
        else if (a>=5&&c>=2000||b>=3000)
            System.out.println("Gold");
        else if (a>=2&&c>=800||b>=1000)
            System.out.println("Silver");
    }
}
