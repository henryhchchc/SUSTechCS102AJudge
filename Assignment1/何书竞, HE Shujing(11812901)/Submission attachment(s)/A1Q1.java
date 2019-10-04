public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        String id = args[1];
        int length = id.length();
        boolean b = id.startsWith("119");
        boolean b1 = id.startsWith("116");
        boolean b2 = id.startsWith("117");
        boolean b3 = id.startsWith("118");
        if(length==8 && (b==true || b1==true || b2==true || b3==true))
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
        else
            System.out.printf("%s", id);

    }
}

