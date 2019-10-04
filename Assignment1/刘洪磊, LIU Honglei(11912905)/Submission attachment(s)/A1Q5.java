public class A1Q5
{
    public static void main(String[] args) {
        int checknumber=0;
        int length=args.length;
        int number1=0;
       int number2=0;
        while (checknumber<length)
        {
            double money = Double.parseDouble(args[checknumber]);
            number1=(int)money;
            number2=number1%10;
            if (number2==2)
            {money=money-2+6;
            System.out.printf("%.1f ",money);}
            if (number2==4)
            {money=money-4+9;
            System.out.printf("%.1f ",money);}
            checknumber++;

        }
    }
}
