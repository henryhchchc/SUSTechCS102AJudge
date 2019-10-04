import java.util.*;
public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        String number = args[1];
        int flag = Integer.parseInt(number.substring(2,3));
        if (number.length()==8&&flag>4&&flag<=9)
            System.out.println(name+",welcome to SUSTECH Hot Pot Restaurant!");
        else
            System.out.println(number);
    }
}
