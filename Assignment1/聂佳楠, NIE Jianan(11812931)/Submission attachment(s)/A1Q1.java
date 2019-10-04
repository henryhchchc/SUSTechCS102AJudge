import java.util.Scanner;
public class A1Q1 {public static void main(String[] args) {
    String name;
    int id;
    Scanner input=new Scanner(System.in);
    name=args[0];
    id=Integer.parseInt(args[1]);
    if (11500000<=id&&id<=11999999)
        System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
    else if(1150000<=id&&id<=1199999)
        System.out.printf("%s",id);
    else
        System.out.println("The wrong id.");
}
}
