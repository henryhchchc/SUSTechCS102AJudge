import java.util.Scanner;
public class A1Q2
{
    public static void main (String [] args)
    {
        int sth,stm,sts,enh,enm,ens;
        Scanner in=new Scanner (System.in);
        sth=in.nextInt();stm=in.nextInt();
        sts=in.nextInt();enh=in.nextInt();
        enm=in.nextInt();ens=in.nextInt();
        int num1=enh-sth;int num2=enm-stm;int num3=ens-sts;
        if (num1==0&&num2==0&&num3==0)
        {
            System.out.print("0s");
        }
        else
            {
                if (num1 == 0 && num2 == 0)
               {
                System.out.printf("%ds", num3);
               }
                else
                    {
                        if (num3 == 0)
                        {
                          num2 = num1 * 60 + num2;
                          System.out.printf("%dm", num2);
                        }
                        else
                            {
                                  if (num3 < 0)
                                  {
                                    num2 = num1 * 60 + num2 - 1;
                                    num3 = num3 + 60;
                                    System.out.printf("%dm%ds", num2, num3);
                                  }
                               else
                                   {
                                      num2 = num1 * 60 + num2;
                                      System.out.printf("%dm%ds", num2, num3);
                                   }
                            }
                    }
            }
    }
}
