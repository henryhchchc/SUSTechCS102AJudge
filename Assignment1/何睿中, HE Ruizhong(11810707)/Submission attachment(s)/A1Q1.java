
public class A1Q1 {
    public static void main (String[] args) {
        int id = Integer.parseInt(args[1]);
        if(11999999>=id&&id>=11510001)
        {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",args[0]);
        }
        else{
            System.out.print(id);
        }
    }

}

