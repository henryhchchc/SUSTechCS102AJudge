public class A1Q1 {
    public static void  main(String[] args){
        String name = args[0];
        int a = Integer.parseInt(args[1]);
        int b = 115;
        int c = 120;
        if(b<a*0.00001&&a*0.00001 < c)

                System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!", name);

        else
            System.out.printf("%d",a);
    }
}
