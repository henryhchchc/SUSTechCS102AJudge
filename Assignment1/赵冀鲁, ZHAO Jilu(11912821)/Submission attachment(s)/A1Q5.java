public class A1Q5
{
    public static void main(String [] args)
    {
        int length =  args.length;
        for(int i=0;i<=length-1;i++)
        {
            float num=Float.parseFloat(args[i]);
            int num2=(int)num/10;
            float num3=num-10*num2;
            if(num3>=2&&num3<3)
            {
                float num4=num2*10+num3+4;
                int num6=(int)num4;
                if(num%1==0){System.out.printf("%d ",num6);}
                else
                    System.out.printf("%.1f ",num4);
            }
            else
                {
                  if (num3 >= 4 && num3 < 5)
                  {
                     float num5=num2*10+num3+5;
                     int num7=(int)num5;
                     if(num%1==0){System.out.printf("%d ",num7);}
                     else
                      System.out.printf("%.1f ",num5);
                  }
                }


        }

    }
}
