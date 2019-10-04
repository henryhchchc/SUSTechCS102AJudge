public class A1Q4 {
    public static void main(String[] args)
    {
        int length = args.length;
        int n;
        int sum = 0;
        int cnt = 0;
        for (int i =0; i < length; i++)
        {
            n = Integer.parseInt(args[i]);
            sum = sum + n;
            cnt++;
            if(cnt >= 10 && sum >= 5000 || n >= 8000 )
            {
                System.out.println("Diamond");
                break;
            }
            else if(cnt >= 5 && sum >= 2000 || n >= 3000)
            {
                System.out.println("Gold");
                break;
            }
            else if(cnt >= 2 && sum >= 800 || n >= 1000)
            {
                System.out.println("Silver");
                break;
            }
        }
    }
}
