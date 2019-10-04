
public class A1Q1 {

    public static void main(String[] args) {
        String name = args[0];;
        int StudentID = Integer.parseInt(args[1]);

        if ((StudentID >= 11500000) && (StudentID < 12000000))
        System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant! ", name);
        else
            System.out.printf("%8d",StudentID);

    }
    }
