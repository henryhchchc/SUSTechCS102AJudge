public class A1Q1 {

    public static void main(String[] args) {
        String name = (args[0]);
        int ID = Integer.parseInt(args[1]);
        int number = ID;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;};
        if (count == 8 && ID >= 11500000 && ID <= 11999999 ) {
            System.out.print(name + ", welcome to SUSTECH Hot Pot Restaurant!");
        }
        else {
            System.out.println(ID);
        }
    }
}