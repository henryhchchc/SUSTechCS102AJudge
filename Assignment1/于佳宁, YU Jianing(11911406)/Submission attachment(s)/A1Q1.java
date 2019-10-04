public class A1Q1 {
    public static void main(String[] args){
        String name=args[0];
        int number=Integer.parseInt(args[1]);
        if(number >= 11500000)
        {if(number <= 20000000)
            System.out.printf(name+"\t"+"Welcom to SUSTECH Hot Pot Restaurant!");
        else if(number > 20000000)
            System.out.printf(name+"\t"+number);
        }
    else if(number <11500000)
        System.out.print(number);
    }
}