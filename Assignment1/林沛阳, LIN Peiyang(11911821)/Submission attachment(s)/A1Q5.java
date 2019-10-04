public class A1Q5
{
    public static void main(String args[])
    {
        int length=args.length;
        double price;
        int T,U;
        double d,UD,P;
        for(int i=0;i<length;i++)
        {
            price=Double.parseDouble(args[i]);
            T=(int)price/10;
            UD=price-10*T;
            U=(int)UD;
            d=UD-U;
            if (U==2||U==4)
            {
                if(U==2) U=6;
                if(U==4) U=9;
                P=10*T+U+d;
                System.out.printf("%.1f ",P);
            }
        }
        System.out.println();
    }
}
