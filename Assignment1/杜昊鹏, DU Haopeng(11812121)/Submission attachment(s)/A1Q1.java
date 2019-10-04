public class A1Q1 {

    public static void main(String[] args) {

        String name = args[0];
        String studentid = args[1];

        int i = Integer.parseInt(studentid);
        double a = i / 100000;
        int b = (int)a;

        if (studentid.length() == 8 && b >= 115 && b <= 119)
            System.out.printf(name + ", welcome to SUSTECH Hot Pot Restaurant!");
        else
            System.out.printf(studentid);
    }
}
