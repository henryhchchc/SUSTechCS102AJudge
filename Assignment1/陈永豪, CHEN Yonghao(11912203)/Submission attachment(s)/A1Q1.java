public class A1Q1 {
    public static void main(String[] args){

        String name= args[0];
        String id= args[1];
        int prefix;
        String pre= id.substring(0,3);
        int length= id.length();

        prefix=Integer.parseInt(pre);

        if(length!=8||prefix>119||prefix<115){
            System.out.printf("%s",id);
        }
        else{
            System.out.printf("%s, welcome to SUSTECH Hotpot Restaurant!",name);
        }
    }
}
