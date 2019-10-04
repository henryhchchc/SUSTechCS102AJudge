
public class A1Q4 {
            public static void main(String[] args) {
                int sum = 0;
                int time = args.length;
                int j = 0;
                int vip = 0;
                while (j < time)
                { sum+= Integer.parseInt(args[j]);
                    j++;
                }
                int i = 0;
                while (i < time)
                {
                    if (Integer.parseInt(args[i]) >= 8000)
                    { vip = 3; }
                    else if (Integer.parseInt(args[i]) >= 3000)
                    {
                        if (vip <= 2)
                        { vip = 2; }
                    }
                    else if (Integer.parseInt(args[i]) >= 1000)
                    {
                        if (vip <= 1)
                        { vip = 1; }
                    }
                    else
                    { vip = 0; }
                    i++;
                }
        if(vip !=0)
          {
              if (vip == 3)
              {
              System.out.print("Diamond");
              }
              else if(vip==2)
              {
                System.out.print("Gold");
              }
              else System.out.print("Silver");
          }

           else if(time>=10&&sum>5000)
           {
            System.out.print("Diamond");
            System.exit(0);
            }
            else if(time>=5&&sum>=2000)
           {
            System.out.print("Gold");
            System.exit(0);
            }
            else if (time>=2&&sum>=800)
            {
            System.out.print("Silver");
            System.exit(0);
            }
          }
    }








