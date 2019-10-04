import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int id = Integer.parseInt(args[1]);
        if(id / 100000 >=115 && id / 100000<=119){
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);

        }
        else{
            System.out.printf("%d",id);


        }



    }
}
