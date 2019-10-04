

public class A1Q1 {
    public static void main(String[]args){
        String name = args[0];
        int id = Integer.parseInt(args[1]);
        if (id <=11999999 && id>11500000)
        System.out.print(name+", welcome to SUSTECH Hot Pot Restaurant!\n" );
        else
            System.out.printf("%d",id);


    }
}
