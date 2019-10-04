public class A1Q5 {
    public static void main(String[] args)
    {
        double wrong;
        double right;
        int m = 0;
        double n = 0;
        int length = args.length;
        for(int i = 0; i < length; i++)
        {
            wrong = Double.parseDouble(args[i]);
            int a;
            m = (int)wrong;
            n = wrong - m;
                a = m % 10;
                if (a == 2)
                {
                    m = m + 4;
                    right = m + n;
                    System.out.printf("%.1f ", right);
                }
                else if(a == 4)
                {
                    m = m + 5;
                    right = m + n;
                    System.out.printf("%.1f ", right);
                }
            }
        }
    }
