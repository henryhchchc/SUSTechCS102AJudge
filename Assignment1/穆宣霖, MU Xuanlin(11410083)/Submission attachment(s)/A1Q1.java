
public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        int studentid = Integer.parseInt(args[1]);
        if(studentid >= 11500000 & studentid <= 11999999)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!\n", name);
        else System.out.printf("%d\n", studentid);

    }

}
