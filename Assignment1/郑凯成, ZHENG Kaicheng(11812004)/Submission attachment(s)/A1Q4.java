
public class A1Q4 {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        int c = 0;
        int length = args.length;
        while (i< length) {
            int a = Integer.parseInt(args[i]);
            i++;
            if(a>b)
                b=a;
            c +=a;
        }
        if (i>=10&&b>=8000||c>=5000)
            System.out.println("Diamond");
        else if (i>=5&&b>=3000||c>=2000)
            System.out.println("Gold");
        else if(i>=2&&b>=1000||c>=800)
            System.out.println("Silver");
    }
}