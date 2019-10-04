public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        String number = args[1];
        char a,b,c;
        a = number.charAt(0);
        b = number.charAt(1);
        c = number.charAt(2);
        int length = number.length();
        if(length != 8){
            System.out.printf("%s",number);
        }
        else if((a == '1') && (b == '1') && ((c >= '5') && (c  <= '9'))){
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant! " ,name);
        }
        else{
            System.out.printf("%s",number);
        }
    }
}
