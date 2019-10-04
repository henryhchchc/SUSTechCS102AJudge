public class A1Q5 {

    public static void main(String[] args)
    {
        //转换类型
        double[] ans = new double[args.length];
        for(int b = 0; b < args.length; ++b)
        {
            ans[b] = Double.parseDouble(args[b]);
        }
        //判断个位
        for(int a = 0; a < ans.length; ++a)
        {
            if(Math.floor(ans[a]) % 10 == 2)
            {
                ans[a] += 4;
                System.out.print(ans[a] + " ");
            }
            else if(Math.floor(ans[a]) % 10 == 4)
            {
                ans[a] += 5;
                System.out.print(ans[a] + " ");
            }
        }

    }
}

