public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        float studentid = Float.parseFloat(args[1]);

        if(studentid >= 11500000 && studentid <= 11999999)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        else
            System.out.printf("%.0f", studentid);

    }
}
