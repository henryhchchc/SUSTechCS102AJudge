
public class A1Q1 {
    public static void main(String[] args) {
     int b=Integer.parseInt(args[1]);
     int a=args[1].length();
     if ( a!=8)
         System.out.printf("%s",args[1]);
     else if ( b>11999999)
         System.out.printf("%s",args[1]);
     else if ( b<11500000)
         System.out.printf("%s",args[1]);
     else
         System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",args[0]);

    }
}
