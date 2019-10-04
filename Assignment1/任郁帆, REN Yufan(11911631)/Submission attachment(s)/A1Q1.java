public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int student = Integer.parseInt(args[1]);
        if(student<=11999999&&student>=11500000){
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);}
        else{
            System.out.printf("%d",student);
        }
    }
}