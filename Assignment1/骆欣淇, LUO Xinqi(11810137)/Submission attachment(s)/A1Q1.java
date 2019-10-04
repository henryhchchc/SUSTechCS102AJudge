package javaa;

public class A1Q1 {
    public static void main(String[] args) {

        int x =Integer.parseInt(args[1]);
        if(x<12000000&&x>11499999){
            System.out.println(args[0]+", welcome to SUSTECH Hot Pot Restaurant!");
        }
        else System.out.println(args[1]);
    }
}
