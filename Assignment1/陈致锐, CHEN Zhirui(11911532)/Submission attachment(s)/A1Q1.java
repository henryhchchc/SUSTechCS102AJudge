public class A1Q1 {
    public static void main(String[] args) {
        int student_id = Integer.parseInt(args[0]);
        String name = args[1];
        if (student_id >= 11500000&&student_id <= 11999999) {
                System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
            }
         else {
            System.out.printf("%d",student_id);
        }
    }
}










