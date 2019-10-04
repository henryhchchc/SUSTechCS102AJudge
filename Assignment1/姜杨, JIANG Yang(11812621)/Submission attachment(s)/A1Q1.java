import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        String num = args[1];
        if (num.length() != 8 || num.charAt(0) != '1' || num.charAt(1) != '1' ){
            System.out.println(num);
        }else if (num.charAt(2) != '5' && num.charAt(2) != '6' && num.charAt(2) != '7' && num.charAt(2) != '8' && num.charAt(2) != '9'){
            System.out.println(num);
        }else {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }
    }
}
