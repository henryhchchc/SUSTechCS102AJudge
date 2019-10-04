
public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        String id = args[1];
        if (id.length() == 8){
            System.out.println(name + ", welcome to SUSTECH Hot Pot Restaurant!");
        } else {
            System.out.println(id);
        }
    }
}
