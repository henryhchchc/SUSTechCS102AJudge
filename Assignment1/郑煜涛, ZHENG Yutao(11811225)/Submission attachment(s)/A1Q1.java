import java.util.Scanner;
public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        String ID = args[1];
        int ID1 = Integer.parseInt(ID);
        if(ID1>=12000000||ID1<11500000 ) {
            System.out.println(ID);
        } else
            System.out.println(name+", welcome to SUSTECH HOT POT Restaurant!");

        }
    }
