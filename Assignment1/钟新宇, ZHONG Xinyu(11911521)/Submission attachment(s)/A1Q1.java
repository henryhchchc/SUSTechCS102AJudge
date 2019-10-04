public class A1Q1 {
    public static void main(String[] args)
    {
        String name = args[0];
        int ID = Integer.parseInt(args[1]);
        int a = ID;
        int cnt = 0;
        for(int i = 0; ID > 0; i++)
        {
           ID = ID / 10;
           cnt++;
        }
        if( cnt == 8 && a / 100000 >= 115 && a / 100000 <= 119)
        {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
        }
        else
        {
            System.out.printf("%d", a);
        }
    }
}
