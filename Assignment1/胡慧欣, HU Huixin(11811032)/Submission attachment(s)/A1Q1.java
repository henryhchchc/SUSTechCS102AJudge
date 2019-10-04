public class A1Q1 {
    public static void main(String[]args){
        String id=args[1];
        String name=args[0];
        int length=id.length();
        int ID=Integer.parseInt(id);
        if(length==8 && ID<=11999999&&ID>=11500000){
           System.out.println("\n"+name+", welcome to SUSTECH Hot Pot Restaurant!");}
           else{
               System.out.println("\n"+ID);
        }
    }
}
