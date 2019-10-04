public class A1Q1 {
    public static void main(String[]args){
        String name=args[0];
        String id=args[1];
        int length=id.length();
        if (length==8&&id.startsWith("1191")|| id.startsWith("1181")||id.startsWith("1171")||id.startsWith("1161"))
        System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        else
            System.out.printf("%s",id);


        }
    }
