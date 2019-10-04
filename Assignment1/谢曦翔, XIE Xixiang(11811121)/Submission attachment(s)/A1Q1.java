public class A1Q1{
    public static void main(String[] args){
        String NAME=args[0];
        String ID=args[1];
        int n=ID.charAt(0)*100+ID.charAt(1)*10+ID.charAt(2);
        if(ID.length()!=8) {
            System.out.println(ID);
        }else if(n<5443||n>5447){
            System.out.println(n);
        }
        else{
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",NAME);
        }
    }
}
