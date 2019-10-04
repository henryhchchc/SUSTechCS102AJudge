public class A1Q1 {
    public static void main(String[] args) {

        String name = args[0];
        int a = Integer.parseInt(args[1]);
        if(a>=11500000&a<=11999999){
            System.out.println(name+", welcome to SUSTECH Hot Pot Restaurant!");
        }else
        System.out.println(a);

    }
}
