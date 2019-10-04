public class A1Q1 {
    public static void main(String[] args) {
        String name=args[0];
        int student_id=Integer.parseInt(args[1]);
        if(student_id>=11500000) {
            if (student_id <= 11999999) {
                System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
            }
                else
                System.out.print(student_id);
        }
        else
            System.out.print(student_id);
    }
}