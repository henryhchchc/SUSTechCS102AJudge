public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int studentid = Integer.parseInt(args[1]);


        if((studentid <= 11500000)||(studentid>=11900000)){
            System.out.printf("%d\n",studentid);
        }
        else
            System.out.printf("%s,welcome to SUSTECH Hot Pot restaurant!",name);

    }
}
