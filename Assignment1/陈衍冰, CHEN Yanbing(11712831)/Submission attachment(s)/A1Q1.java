public class A1Q1 {
    public static void main(String[] args){
        String Studentname = args[0];
        String Studentid = args[1];
        int id = Integer.parseInt(Studentid);
        if (id <= 11999999 && id >=11500000)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!\n", Studentname);
        else
            System.out.printf("%d\n",id);

    }
}
