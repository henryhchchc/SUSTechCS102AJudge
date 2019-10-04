public class A1Q1 {

    public static void main(String[] args) {
        String name = args[0];
        String student_id = args[1];
        Integer a = new Integer(student_id);
        if(a< 11500000||a> 12000000) {
            System.out.print(a);
        } else {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }

    }
}