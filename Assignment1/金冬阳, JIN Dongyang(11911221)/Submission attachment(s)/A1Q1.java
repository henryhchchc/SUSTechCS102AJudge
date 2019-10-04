
public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
int number = Integer.parseInt(args[1]);
        if (number>=11510001 && number<=11919999)
            System.out.printf("%s,welcome to SUSTECH Hot Pot restaurant",name);
        else
            System.out.println(number);
    }
}