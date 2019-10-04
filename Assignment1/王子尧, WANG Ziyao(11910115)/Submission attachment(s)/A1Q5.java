

public class A1Q5 {
    public static void main(String []args){
        double number;
        int length=args.length;
        for (int a=0;a<length;a=a+1){
            number=Double.parseDouble(args[a]);
            if ((int)number%10==2)
                System.out.print((number+4)+" ");
            else if ((int)number%10==4)
                System.out.print((number+5)+" ");
        }
    }
}
