//package Assignment;

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];

        String ID = args[1];

        int prefix = (ID.charAt(0)-48)*100+(ID.charAt(1)-48)*10+(ID.charAt(2)-48);

        if(ID.length()!=8){
            System.out.println(ID);
        }
        else if(prefix<115||prefix>119){
            System.out.println(ID);
        }
        else{
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }
    }
}
