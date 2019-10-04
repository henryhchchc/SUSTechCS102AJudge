public class A1Q4 {

    public static void main(String[] args) {
        int sum = 0, max = -1,times = args.length;
        for(int i=0;i<=times-1;i++)
        {
            int a=Integer.parseInt(args[i]);
            sum+=a;
            if(a>=max)   max=a;
        }
        if ((times >= 10 && sum >= 5000) || max >= 8000) System.out.print("Diamond");
        else if ((times >= 5 && sum >= 2000) || max >= 3000) System.out.print("Gold");
        else if ((times >= 2 && sum >= 800) || max >= 1000) System.out.print("Silver");
    }
}
