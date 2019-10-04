public class A1Q1
{   public static void main(String[]args)
{ String name=args[0];
    int pre,later,all;
    all=Integer.parseInt(args[1]);
    pre=all/100000;
    later=all-pre*100000;
    if (pre>119|pre<115|later<10000|later>=99999)
        System.out.printf("%d%d",pre,later);
    else
        System.out.printf("%s, welcome to SUSTECH Hot Ppt Restaurant!",name);
}
}
