public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
       int id = Integer.parseInt(args[1]);
        if(String.valueOf(id).length() == 8){
            if(id <= 11999999 && id >= 11500000){
                System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!\n", name);
            }else{
                System.out.println(id);
            }
        }else {
            System.out.println(id);
        }
    }
}
