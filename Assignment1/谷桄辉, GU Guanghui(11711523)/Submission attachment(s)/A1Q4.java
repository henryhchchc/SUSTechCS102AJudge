
public class A1Q4{
    public static void main(String[] args) {
        int times = 0;
        double total = 0;
        times = args.length;
        for (int i = 0; i < args.length; i++)
        {
            total=total+Integer.parseInt(args[i]);
        }
        int a,b,c;
        a=0;b=0;c=0;
        for (int i = 0; i < args.length; i++){
            if (Integer.parseInt(args[i])>=1000&Integer.parseInt(args[i])<3000)
                a++;
            else if (Integer.parseInt(args[i])>=3000&Integer.parseInt(args[i])<8000)
                b++;
            else if (Integer.parseInt(args[i])>=8000)
                c++;
        }
        if ((times>=10&&total>=5000)||c>0)
            System.out.print("Diamond");
        else if ((times>=5&&total>=2000&&!(times>=10&&total>=5000))||b>0)
            System.out.print("Gold");
        else if ((times>=2&&total>=800&&!(times>=5&&total>=2000))||a>0)
            System.out.print("Sliver");
    }
}