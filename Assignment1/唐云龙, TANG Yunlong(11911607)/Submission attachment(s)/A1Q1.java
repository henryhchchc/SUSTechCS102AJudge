public class A1Q1 {
    public static void main(String[] args) {
        String studentName = args[0];
        int studentNumbers =  Integer.parseInt(args[1]);
        if(studentNumbers <= 11999999 && studentNumbers>=11500000 ){
            System.out.printf(" %s,welcome to SUSTECH Hot Pot Restaurant!",studentName);
        }
        else{
            System.out.printf("%d ",studentNumbers);
        }
    } 
}
    