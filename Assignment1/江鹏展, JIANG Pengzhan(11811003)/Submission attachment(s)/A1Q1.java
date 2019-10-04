public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        String id = args[1];
        int ID=0;
        if (id.matches("^[0-9]*$")){
            ID = Integer.valueOf(id);
        }
        if (11500000<=ID&&ID<=11999999){
            System.out.print( name + ", welcome to SUSTECH Hot Pot Restaurant!");
        }
        else{
            System.out.println(id);
        }
    }
}
