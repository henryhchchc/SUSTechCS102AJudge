public class A1Q1
{
public static void main(String[] args)
    {
        String name = args[0];
        int ID = Integer.parseInt(args[1]);
        if (ID / 100000 == 119 || ID / 100000 == 118 || ID / 100000 == 117 || ID / 100000 == 116 || ID / 100000 == 115)
        {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
            }

                
     else
                {
                    System.out.printf("%s",ID);
                }
}
}
