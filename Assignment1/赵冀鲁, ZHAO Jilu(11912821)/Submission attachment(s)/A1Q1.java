public class A1Q1
{
    public static void main(String [] args)
    {
        int num;
        String name= args[0];
        num = Integer.parseInt(args[1]);
        if(num<11500000||num>=12000000)
        {
            System.out.printf("%d",num);
        }
        else
        {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }
    }
}

