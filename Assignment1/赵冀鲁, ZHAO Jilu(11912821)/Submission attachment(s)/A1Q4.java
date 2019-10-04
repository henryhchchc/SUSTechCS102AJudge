public class A1Q4{
    public static void main(String [] args)
    {
        int length=args.length;
        int num2=0;int num4=0;int num5=0;
        for(int num1=0;num1<length;num1++)
        {
            int num3=Integer.parseInt(args[num1]);
            num2+=num3;
            num4++;
            if(num5<=num3)
            {
                num5=num3;
            }
        }
        if((num4>=10&&num2>=5000)||(num5>=8000))
        {
            System.out.print("Diamond");
        }
        else
        {
            if ((num4>=5&&num2>=2000)||(num5>=3000))
            {
                System.out.print("Gold");
            }
            else
                if((num4>=2&&num2>=800)||(num5>=1000))
            {
                System.out.print("Silver");
            }


        }
    }
}
