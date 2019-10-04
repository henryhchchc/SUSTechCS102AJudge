
public class A1Q1 {
    public static void main(String[]args){

        System.out.println("Enter your name and ID ");

         String name=args[0];
          int ID=Integer.parseInt(args[1]);
        float  A=ID/10000000;
        if(A>=1&&A<=10&&ID>=11500000&&ID<12000000)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        else
            System.out.print(ID);
    }
}
