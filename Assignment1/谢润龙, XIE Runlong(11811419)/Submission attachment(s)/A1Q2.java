

import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int s1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();
        int m = (h2-h1)*60 + m2-m1;
        int s = s2-s1;
        if (m==0)
            System.out.printf("%ds\n",s);
            else
                if (m>0)
                {if (s>0)
                    System.out.printf("%dm%ds\n",m,s);
                else
                    {if(s==0)
                    System.out.printf("%dm\n",m);
                else
                    {if (s<0)
                    m = --m;
                    s = 60+s;
                    System.out.printf("%dm%ds\n",m,s);
                    }
                    }
                }


    }
}
