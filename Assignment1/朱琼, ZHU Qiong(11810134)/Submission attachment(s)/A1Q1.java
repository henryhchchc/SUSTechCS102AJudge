public class A1Q1 {
    public static void main(String[] args){
        String number = args[1];
        int length = number.length();

        if((number.startsWith("115")||number.startsWith("116")||number.startsWith("117")||number.startsWith("118")||number.startsWith("119")) &&( length == 8))
            System.out.println(args[0] +", Welcome to SUSTECH Hot Pot Restaurant!");
        else
            System.out.print(args[1]);
    }
}
