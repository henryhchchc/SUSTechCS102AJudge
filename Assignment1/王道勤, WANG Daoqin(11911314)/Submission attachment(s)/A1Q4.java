public class A1Q4 {

    public static void main(String[] args)
    {
        double[] ans = new double[args.length];
        for(int b = 0; b < args.length; ++b)
        {
            ans[b] = Double.parseDouble(args[b]);
        }
        int a = ans.length;
double total = 0;
for (int i = 1; i < ans.length; i++)
    {
total += ans[i];
    }
        double max = ans[0];
for(int zxy = 1; zxy < args.length; zxy++)
        {
            if (ans[zxy] > max)      max = ans[zxy];
        }
    if(a >= 10 && total >= 5000 && max >= 8000)
        System.out.println("Diamond");
    else if(a >= 5 && total >= 2000 && max >= 3000)
        System.out.println("Gold");
    else if(a >= 2 && total >= 800 && max >= 1000)
        System.out.println("Silver");
    }
}