
public class A1Q1 {
    public static void main(String args[])
    {
       String a;
        int b;
       a=(args[0]);
      b=Integer.parseInt(args[1]);
       if (b<11500000||b>11999999) {
           System.out.printf(""+b);
       }
       else {
           System.out.printf(a+", welcome to SUSTECH Hot Pot Restaurant!");
       }
    }
}