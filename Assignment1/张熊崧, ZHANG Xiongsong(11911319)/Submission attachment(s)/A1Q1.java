

public class A1Q1 {
    public static void main(String[] args) {


        String name = args[0];
        int a= Integer.parseInt(args[1]);
        double b = a / 100000;
        if((b>115)&&(b < 120)){
        System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);}
        else{
            System.out.print(a);
        }


    }
}