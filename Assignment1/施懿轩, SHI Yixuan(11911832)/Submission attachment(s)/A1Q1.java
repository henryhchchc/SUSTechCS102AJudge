public class A1Q1 {

    public static void main(String[] args) {
        String name = args[0];
        int SID = Integer.parseInt(args[1]);
        if (SID <= 11999999 && SID >= 11500001) {
            System.out.printf("%s" + ",welcome to SUSTECH Hot Pot Restaurant!", name);
        }else{
            System.out.printf("%s",SID);
        }

    }
}