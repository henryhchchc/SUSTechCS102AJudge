public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int id = Integer.parseInt(args[1]);
        int a =id/100000;
        if(a>=115 && a<=119)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!\n",name);
        else
            System.out.printf("%d",id);
    }
}