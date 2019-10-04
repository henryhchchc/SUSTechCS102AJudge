public class A1Q4 {
    public static void main(String[] args) {
        int [] a= new int[args.length];
        int i;
        int n = 0;
        int b = 0;
        for(i=0;i<args.length;i++)
        {
            a[i] = Integer.parseInt(args[i]);
            if (a[i] >= 8000)
            {System.out.print("Diamond");
                break;}
            else if (a[i]>=3000)
            {System.out.print("Gold");
                break;}
            else if (a[i]>=1000)
            {System.out.print("Silver");
                break;}
            else if (a[i] != 0) {
                n++;
                b = b + a[i];}
        }
        if(n>=10&&b>=5000)
            System.out.print("Diamond");
        else if(n>=5&&b>=2000)
            System.out.print("Gold");
        else if(n>=2&&b>=800)
            System.out.print("Silver");
    }
}
